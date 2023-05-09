package condominium.apicond.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import condominium.apicond.model.ResidentModel;
import condominium.apicond.methods.Resident;
import condominium.apicond.methods.DynamicArray;



@RestController 
@RequestMapping

public class ResidentController {
	DynamicArray list = new DynamicArray();
	
	@PostMapping("/resident")
	@ResponseStatus(code = HttpStatus.CREATED)
	public void register(@RequestBody ResidentModel data) {
		Resident resident = new Resident();
		resident.setData(data.name(), data.phone(), data.appartament(), data.parkingNumber(), data.emergencyContact());
		list.add(resident);
	}

	@GetMapping("/resident")
	@ResponseStatus(code = HttpStatus.OK)
	public Object list() {
		return list.printList();
	}
	
	@GetMapping("/resident/{id}")
	@ResponseStatus(code = HttpStatus.OK)
	public Object item(@PathVariable int id) {
		return list.filterItem(id);
	}
	
	
	@PutMapping("/resident/{id}")
	@ResponseStatus(code = HttpStatus.ACCEPTED)
	public String update(@RequestBody Resident data, @PathVariable int id) {
		list.updateItem(id,data);
		return "Alterado com sucesso";
	}
	
	@DeleteMapping("/resident/{id}")
	@ResponseStatus(code = HttpStatus.OK)
	public void delete(@PathVariable int id) {
		list.removeItem(id);
	}
}

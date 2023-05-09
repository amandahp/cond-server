package condominium.apicond.methods;

public class Resident {

	private int id;
	private static int count = 0;
	private String name;
	private String phone;
	private Integer appartament;
	private String parkingNumber;
	private String emergencyContact;
	
	public Resident() {
		this.setId(++count);
	}
	
    public void setData(String name, String phone, int appartmanet, String parkingNumber, String emergencyContact){
        this.name = name;
        this.phone = phone;
        this.appartament = appartmanet;
        this.parkingNumber = parkingNumber;
        this.emergencyContact = emergencyContact;
    }
	
	public String[] getData() {
		String[] data = new String[5];
		
		data[0] = this.name;
		data[1] = this.phone;
		data[2] = Integer.toString(this.appartament);
		data[3] = this.parkingNumber;
		data[4] = this.emergencyContact;
		
		return data;
	}

	public int getId() {
		return this.id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Integer getAppartament() {
		return this.appartament;
	}

	public void setAppartament(int appartament) {
		this.appartament = appartament;
	}

	public String getParkingNumber() {
		return this.parkingNumber;
	}

	public void setParkingNumber(String parkingNumber) {
		this.parkingNumber = parkingNumber;
	}

	public String getEmergencyContact() {
		return this.emergencyContact;
	}

	public void setEmergencyContact(String emergencyContact) {
		this.emergencyContact = emergencyContact;
	}
}

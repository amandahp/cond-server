package condominium.apicond.methods;

import condominium.apicond.utils.Utils;

public class DynamicArray {
	private Resident[] list;
	private int maxSize;
	private int length;

	public DynamicArray() {
		this.maxSize = 1;
		this.list = new Resident[maxSize];
		this.length = 0;
	}

	public void add(Resident item) {
		if (isFull()) {
			maxSize = 2 * maxSize;
			Resident[] tempList = new Resident[2 * maxSize];

			for (int i = 0; i < length; i++) {
				tempList[i] = list[i];
			}

			list = tempList;
		}

		list[length] = item;
		length++;
	}

	public void removeItem(int id) {
		Utils Utils = new Utils();
		int indexToRemove = Utils.findIndex(list, id);
		
		if (indexToRemove != -1) {
			for (int i = indexToRemove; i < this.length - 1; i++) {
				list[i] = list[i + 1];
			}

			list[this.length - 1] = null;
			this.length--;

		}
		
	}

	public void updateItem(int id,  Resident updatedResident) {
		Utils Utils = new Utils();
		int indexToUpdate = Utils.findIndex(list, id);
		
        if (updatedResident.getName() != null) {
            list[indexToUpdate].setName(updatedResident.getName());
        }
        if (updatedResident.getPhone() != null) {
        	list[indexToUpdate].setPhone(updatedResident.getPhone());
        }
        if (updatedResident.getAppartament() != null) {
        	list[indexToUpdate].setAppartament(updatedResident.getAppartament());
        }
        if (updatedResident.getParkingNumber() != null) {
        	list[indexToUpdate].setParkingNumber(updatedResident.getParkingNumber());
        }
        if (updatedResident.getEmergencyContact() != null) {
        	list[indexToUpdate].setEmergencyContact(updatedResident.getEmergencyContact());
        }
	}

	public Resident filterItem(int id) {
		Utils Utils = new Utils();
		int indexToSearch =  Utils.findIndex(list, id);
		
		return list[indexToSearch];
	};

	public Resident[] printList() {
		return list;
	}

	boolean isFull() {
		return length == maxSize;
	}

}

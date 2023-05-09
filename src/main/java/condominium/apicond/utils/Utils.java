package condominium.apicond.utils;

import condominium.apicond.methods.Resident;

public class Utils {
	
	public int findIndex(Resident[] list, int id) {
		int newIndex = -1;
		for (int i = 0; i < list.length; i++) {
			if (list[i].getId() == id) {
				newIndex = i;
				break;
			}
		}
		return newIndex;
	}

}

package gui.util;

import java.util.Random;

public class Formulas {

	public static int generateChaosEffect(Integer value, Integer Slots) {

		if (Slots > 0) {
			Integer newValue;
			Integer negativeValue;
			
			Random rand = new Random();
			
			int sort = rand.nextInt(10);
			if (sort >= 6) {
				newValue = rand.nextInt(5) + 1;
			}
			else {
				newValue = (-6) + rand.nextInt(6) + 1;
			}
			return value + newValue;
		}
		return value;
	}

	public static int decreaseSlotNumber(Integer value) {
		int slot = value;
		if (value > 0) {
			slot = slot - 1;
			return slot;
		} else {
			System.out.println("no upgrades available");
		}
		return 0;
	}
	
	
}

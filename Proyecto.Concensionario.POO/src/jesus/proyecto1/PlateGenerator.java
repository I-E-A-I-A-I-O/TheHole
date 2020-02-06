package jesus.proyecto1;

import java.util.Random;

public class PlateGenerator {
	int counter = 0;
	
	public String plate(int lenght) {
		final String string = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "0123456789";
		
		Random ran = new Random();
		
		int ranChar;
		String returnString = "";
		
		do {
			
			ranChar = ran.nextInt(string.length());
			returnString = returnString + string.charAt(ranChar);
			counter++;
			
		} while (counter < lenght);
		
		return returnString;
	}
}

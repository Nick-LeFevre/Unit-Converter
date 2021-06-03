package revature;

import java.util.Scanner;

public class UnitConverter {
	public static void main(String[] args) {
		
		int menuSelection = 0;
	
		while(menuSelection != 5) {
			System.out.println("\r\n"
			+ "Enter an option for unit conversion: \r\n"
			+ "Volume Conversion\r\n"
			+ "\n " + "1. Teaspoons to Cups \n"
			+ "\n " + "2. Ounces to Milliliters \n"
			+ "\r\n" 
			+ "Distance Conversions \r\n"
			+ "\r\n " + "3. Miles to Kilometers \r\n"
			+ "\r\n " + "4. Feet to Meters \r\n"
			+ "\r\n" + "5. Quit");	
		
		Scanner in = new Scanner(System.in);
		float conversion;
		int num;
		
		switch (menuSelection = in.nextInt()) {
			case 1: System.out.println("Enter the number you would like to convert: ");
				num = in.nextInt();
				conversion = num/48f;
				System.out.println(num + " teaspoons equals " + conversion + " cups.");
				break;
			case 2: System.out.println("Enter the number you would like to convert: ");
				num = in.nextInt();
				conversion = num * 29.5735f;
				System.out.println(num + " ounces equals " + conversion + " milliliters.");
				break;
			case 3: System.out.println("Enter the number you would like to convert: ");
				num = in.nextInt();
				conversion = num*1.609f; 
				System.out.println(num + " miles equals " + conversion + " kilometers.");
				break;
			case 4: System.out.println("Enter the number you would like to convert: ");
				num = in.nextInt();
				conversion = num/3.281f;
				System.out.println(num + " feet equals " + conversion + " meters.");
				break;
			default: 
				System.out.println("You have exited the unit converter.");
				break;
			}
		}
	}
}	

//package lab1;

import java.util.Scanner;

public class ConvertFToC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter temperature in Farenheit: ");
		double farenheit = input.nextDouble();
		
		double celsius = 5.0 / 9 * (farenheit - 32);
		
		System.out.println("The temperature in celsius is " + celsius);

	}

}

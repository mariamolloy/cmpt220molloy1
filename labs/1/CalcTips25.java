package lab1;

import java.util.Scanner;

public class CalcTips25 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
	
		System.out.print("Enter the subtotal and a gratuity rate: ");
	
		double sub = input.nextDouble();
		double rate = input.nextDouble();
	
		double grat = sub * (rate * .01);
		double total = sub + grat;
	
		System.out.println("The gratuity is $" + (int)(grat * 100) / 100. + " and total is $" + (int)(total * 100) / 100.);
	}
}


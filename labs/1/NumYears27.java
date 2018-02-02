package lab1;

import java.util.Scanner;

public class NumYears27 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of minutes: ");
		
		long min = input.nextLong();
		long years = min / 525600;
		long days = (min % 525600) / 1440;
		
		System.out.println(min + " minutes is approximately " + years + " years and " + days + " days");
		

	}

}

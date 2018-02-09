import java.util.Scanner;

public class Sort6_5 {
	
	public static void displaySortedNumbers(double num1, double num2, double num3) {
		double min = 0;
		double mid = 0;
		double max = 0;
		if ((num1 < num2) && (num2 < num3)){
			min = num1;
			mid = num2;
			max = num3;
			System.out.println(min + ", " + mid + ", " + max)	;
		}	
		else if ((num1 < num3) && (num3 < num2)) {
			min = num1;
			mid = num3;
			max = num2;
			System.out.println(min + ", " + mid + ", " + max)	;
		}
		else if ((num2 < num1) && (num1 < num3)) {
			min = num2;
			mid = num1;
			max = num3;
			System.out.println(min + ", " + mid + ", " + max)	;
		}
		else if ((num2 < num3) && (num3 < num1)) {
			min = num2;
			mid = num3;
			max = num1;
			System.out.println(min + ", " + mid + ", " + max)	;
		}
		else if ((num3 < num2) && (num2 < num1)) {
			min = num3;
			mid = num2;
			max = num1;
			System.out.println(min + ", " + mid + ", " + max)	;
		}
		else if ((num3 < num1) && (num1 < num2)) {
			min = num3;
			mid = num1;
			max = num2;
			System.out.println(min + ", " + mid + ", " + max)	;
		}
		else {
			System.out.println("Please enter three unique numbers");
		}
		
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter three unique numbers: ");
		double number1 = input.nextDouble();
		double number2 = input.nextDouble();
		double number3 = input.nextDouble();
		
		displaySortedNumbers(number1, number2, number3);

	}

}



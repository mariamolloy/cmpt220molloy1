import java.util.Scanner;

public class FinancialApp4_23 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter employee's name: ");
		String name = input.nextLine();
		
		System.out.println("Enter number of hours worked in a week: ");
		double hours = input.nextDouble();
		
		System.out.println("Enter hourly pay rate: ");
		double rate = input.nextDouble();
		
		System.out.println("Enter federal tax withholding rate: ");
		double fedTax = input.nextDouble();
		
		System.out.println("Enter state tax withholding rate: ");
		double stateTax = input.nextDouble();
		
		double gross = hours * rate;
		double fedWitholding = gross * fedTax;
		double stateWitholding = gross * stateTax;
		double totalDeduction = fedWitholding + stateWitholding;
		double net = gross - totalDeduction;
		
		System.out.println("Employee name: " + name);
		System.out.println("Hours worked: " + hours);
		System.out.println("Pay rate: " + rate);
		System.out.printf("Gross pay: $%4.2f \n", gross);
		System.out.println("Deductions: ");
		System.out.printf("	Federal Withholding (" + (fedTax * 100.) + "%%): $%4.2f \n", fedWitholding);
		System.out.printf("	State Withholding (" + (stateTax * 100.) + "%%): $%4.2f \n", stateWitholding);
		System.out.printf("	Total Deductions: $%4.2f \n", totalDeduction);
		System.out.printf("Net pay: $%4.2f", net);
		
		
		
	}

}

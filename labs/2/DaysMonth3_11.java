import java.util.Scanner;

public class DaysMonth3_11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a month and year: ");
		int month = input.nextInt();
		int year = input.nextInt();
		int days = 0;
		String monthName = "";
		
		if ((month == 2) && (year % 4 == 0)) {
			days = 29;
			monthName = "February";
		}
		else if (month == 1) {
			days = 31;
			monthName = "January";
		}
		else if (month == 2) {
			days = 28;
			monthName = "February";
		}
		else if (month == 3) {
			days = 31;
			monthName = "March";
		}
		else if (month == 4) {
			days = 30;
			monthName = "April";
		}
		else if (month == 5) {
			days = 31;
			monthName = "May";
		}
		else if (month == 6) {
			days = 30;
			monthName = "June";
		}
		else if (month == 7) {
			days = 31;
			monthName = "July";
		}
		else if (month == 8) {
			days = 31;
			monthName = "August";
		}
		else if (month == 9) {
			days = 30;
			monthName = "September";
		}
		else if (month == 10) {
			days = 31;
			monthName = "October";
		}
		else if (month == 11) {
			days = 30;
			monthName = "November";
		}
		else if (month == 12) {
			days = 31;
			monthName = "December";
		}
		
		System.out.println(monthName + " " + year + " had " + days + " days");

	}

}

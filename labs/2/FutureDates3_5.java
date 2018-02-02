import java.util.Scanner;

public class FutureDates3_5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter today's day: ");
		int todayNum = input.nextInt();
		String today = "";
		
		if (todayNum == 0)
			today = "Sunday";
		else if (todayNum == 1)
			today = "Monday";
		else if (todayNum == 2)
			today = "Tuesday";
		else if (todayNum == 3)
			today = "Wednesday";
		else if (todayNum == 4)
			today = "Thursday";
		else if (todayNum == 5)
			today = "Friday";
		else if (todayNum == 6)
			today = "Saturday";
		
		System.out.println("Enter the number of days elapsed since today: ");
		int elapsed = input.nextInt();
		
		int futureNum = (todayNum + (elapsed % 7)) % 7;
		String future = "";
		
		if (futureNum == 0)
			future = "Sunday";
		else if (futureNum == 1)
			future = "Monday";
		else if (futureNum == 2)
			future = "Tuesday";
		else if (futureNum == 3)
			future = "Wednesday";
		else if (futureNum == 4)
			future = "Thursday";
		else if (futureNum == 5)
			future = "Friday";
		else if (futureNum == 6)
			future = "Saturday";
		
		System.out.println("Today is " + today + " and the future day is " + future);
		
		
	}

}

import java.util.Scanner;

public class Count5_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int pos = 0;
		int neg = 0;
		int totalInts = 0;
		double totalCount = 0.0;
		double avg = 0.0;
		
		System.out.print("Enter an integer, the input ends if it is 0:");
		
		int inp = input.nextInt();
		if (inp == 0) {
			System.out.println("No numbers are entered except 0");
		}
		else {
			while (inp != 0) {
				if (inp > 0) {
					pos++;
				}
				else if (inp < 0) {
					neg++;
				}
				totalInts++;
				totalCount = totalCount + inp;
				inp = input.nextInt();
			}
		
			avg = totalCount / totalInts;
		
			System.out.println("The number of positives is " + pos);
			System.out.println("The number of negatives is " + neg);
			System.out.println("The total is " + totalCount);
			System.out.println("The average is " + avg);
		}
	}

}

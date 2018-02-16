import java.util.Scanner;
public class DistinctNums7_5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] distinctNums = new int[10];
		
		System.out.print("Enter 10 numbers: ");
		 int num = 0;
		 int count = 0;
		 
		 for (int i = 0; i < 10; i++) {
			 num = input.nextInt();
			 if (distinct(distinctNums, num) == true) {
				 distinctNums[i] = num;
				 count++;
			 }
		 }
		 
		 System.out.println("The number of distinct numbers is " + count);
		 System.out.println("The distinct numbers are: ");
		 
		 for (int j = 0; j < distinctNums.length; j++) {
			 if (distinctNums[j] != 0) {
				 System.out.print(distinctNums[j] + " ");
			 }
		 }
		

	}
	public static boolean distinct(int[] arr, int n) {
		
		for (int i = 0; i < arr.length; i++){
			if (arr[i] == n) {
				return false;
			}
		}
		return true;
	}

}

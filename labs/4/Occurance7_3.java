import java.util.Scanner;
public class Occurance7_3 {

	public static void main(String[] args) {
		int[] intList = new int[100];
		
		System.out.print("Enter integers between 1 and 100, input ends with 0: ");
		
		count(intList);
		
		for (int i = 0; i < intList.length; i++) {
			if (intList[i] == 1) {
				System.out.println(i + " occurs 1 time");
			}
			else if(intList[i] > 1) {
				System.out.println(i + " occurs " + intList[i] + " times");
			}
		}
	}

	public static void count(int[] list) {
		Scanner input = new Scanner(System.in);	
		int num = -1;
		while (num != 0) {
			num = input.nextInt();
			if (num > 1 && num < 100)
				list[num]++;
		}	
	} 

}

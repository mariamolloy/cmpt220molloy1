import java.util.Scanner;
public class Sorted7_19 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the size of the list: ");
		int size = input.nextInt();
		System.out.println("Enter the contents of the list: ");
		int[] list = new int[size];
		
		for (int i = 0; i < list.length; i++) {
			int n = input.nextInt();
			list[i] = n;
		}
		
		System.out.print("The list has " + size + " integers ");
		for (int j = 0; j < list.length; j++) {
			System.out.print(list[j] + " ");
		}
		
		if (isSorted(list)) {
			System.out.println("\nThe list is already sorted");
		}
		else {
			System.out.println("\nThe list is not sorted");
		} 

	}
	
	public static boolean isSorted(int[] list) {
		int smallest = list[0];
		for (int i = 1; i < list.length; i++) {
			if (list[i] < smallest) {
				return false;
			}
			else {
				smallest = list[i];
			}
		}
		return true;
	}

}

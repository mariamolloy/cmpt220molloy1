import java.util.Scanner;

public class EliminateDuplicates7_15 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter 10 numbers: ");
		int[] arr = new int[10];
		
		for (int i = 0; i < 10; i++) {
			arr[i] = input.nextInt();
		}
		
		int[] distincts = eliminateDuplicates(arr);
		
		System.out.print("The distinct numbers are: ");
		
		for (int j = 0; j < distincts.length; j++) {
			if (distincts[j] != 0) {
				System.out.print(distincts[j] + " ");
			}
		}
	}
	
	public static int[] eliminateDuplicates(int[] list) {
		int temp = 0;
		int distinctList[] = new int[list.length];
		
		for (int i = 0; i < list.length; i++) {
			boolean duplicate = false;
			for (int j = 0; j < list.length; j++) {
				if (distinctList[j] == list[i])
					duplicate = true;
			}
			if (duplicate == false) {
				distinctList[temp++] = list[i];
			}
		}
		int[] eliminatedNums = new int[temp];
		for (int k = 0; k < temp; k++) {
			eliminatedNums[k] = distinctList[k];
		}
		return eliminatedNums;
	}

}

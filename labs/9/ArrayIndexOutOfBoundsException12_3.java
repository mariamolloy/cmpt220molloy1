import java.util.Scanner;
public class ArrayIndexOutOfBoundsException12_3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[] arr = new int[100];
		for (int i = 0; i < 100; i++) {
			arr[i] = (int)(Math.random() * 10);
		}

		System.out.print("Enter an index: ");
		int index = input.nextInt();
		if (index < 100)
			System.out.println(arr[index]);
		else
			System.out.println("Out of Bounds");
	}

}

import java.util.Scanner;
public class Matrix6_17 {	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");		
		int num = input.nextInt();
		printMatrix(num);

	}
	
	public static void printMatrix(int n) {	
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print((int)(Math.random() * 2));
			}
			System.out.print("\n");
		}
	}

}

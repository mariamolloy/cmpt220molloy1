import java.util.Scanner;
public class SumColumn8_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a 3-by-4 matrix row by row: ");
		
		double[][] nums;
		nums = new double[3][4];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				nums[i][j] = input.nextDouble();
			}
		}
		
		
		System.out.println("Sum of the elements at column 0 is " + sumColumn(nums, 0));
		System.out.println("Sum of the elements at column 1 is " + sumColumn(nums, 1));
		System.out.println("Sum of the elements at column 2 is " + sumColumn(nums, 2));
		System.out.println("Sum of the elements at column 3 is " + sumColumn(nums, 3));
		
	}
	
	public static double sumColumn(double[][] m, int columnIndex) {
		double sum = 0;
		for (int i = 0; i < m.length; i++) {
			sum += m[i][columnIndex];
		}
		return sum;
	}

}

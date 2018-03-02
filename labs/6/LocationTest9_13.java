import java.util.Scanner;
public class LocationTest9_13 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of rows and columns in the array: ");
		int r = input.nextInt();
		int c = input.nextInt();
		
		System.out.println("Enter the array: ");
		double[][] arr = new double[r][c];
		for(int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				arr[i][j] = input.nextDouble();
			}
		}
		
		System.out.println("The location of the largest element is " + 
				locateLargest(arr).getMaxValue() + " at (" + 
				locateLargest(arr).getRow() + "," + locateLargest(arr).getColumn() + ")");

	}
	
	public static Location locateLargest(double[][] a) {
		Location loc = new Location(a);
		return loc;
	}

}

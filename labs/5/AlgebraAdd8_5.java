import java.util.Scanner;
public class AlgebraAdd8_5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter matrix1: ");
		
		double[][] matrix1 = new double[3][3];
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				double inp = input.nextDouble();
				matrix1[i][j] = inp;
			}
		}
		
		double[][] matrix2 = new double[3][3];
		System.out.println("Enter matrix2: ");
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				double inp = input.nextDouble();
				matrix2[i][j] = inp;
			}
		}
		
		for (int row = 0; row < matrix1.length; row++) {
			 for (int column = 0; column < matrix1[row].length; column++) {
				 if ((row == 1) && (column == 2))
					System.out.printf("%-10.1f+", matrix1[row][column]);
				 else
					 System.out.printf("%-10.1f", matrix1[row][column]);
			 }
			 

			 for (int column = 0; column < matrix2[row].length; column++) {
				 if ((row == 1) && (column == 2))
				    System.out.printf("%10.1f =", matrix2[row][column]);
				 else 
					System.out.printf("%10.1f", matrix2[row][column]);
				 }
				 
			for(int column = 0; column < matrix2[row].length; column++) {
				System.out.printf("%10.1f", addMatrix(matrix1, matrix2)[row][column]);
			}
			System.out.print("\n");
		}
		
	}
	
	public static double[][] addMatrix(double[][] a, double[][] b){
		double[][] sums = new double[a.length][a[0].length];
		for (int row = 0; row < a.length; row++) {
			for (int column = 0; column < a[0].length; column++) {
				double add = a[row][column] + b[row][column];
				sums[row][column] = add;
			}
		}
		return sums;
	}

}

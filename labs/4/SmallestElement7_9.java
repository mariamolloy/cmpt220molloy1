import java.util.Scanner;
public class SmallestElement7_9 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter 10 numbers: ");
		double[] inputList = new double[10];
		
		double num = 0;
		for (int i = 0; i < 10; i++) {
			num = input.nextDouble();
			inputList[i] = num;
		}
		
		System.out.println("The minimum number is " + min(inputList));
	}
	
	public static double min(double[] array) {
		double min = array[0];
		int j = 1;
		while (j < array.length) {
			if (array[j] < array[j - 1]) {
				min = array[j];
			}
			j++;
		}
		return min;
	}

}

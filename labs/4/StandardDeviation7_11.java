import java.util.Scanner;
public class StandardDeviation7_11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 10 numbers: ");
		
		double num = 0;
		double[] inp = new double[10];
		
		for (int i = 0; i < 10; i++) {
			num = input.nextDouble();
			inp[i] = num;
		}
		
		System.out.printf("The mean is %-10.2f \n", mean(inp));
		System.out.printf("The standard deviation is %-10.5f", deviation(inp));
		
	}
	
	/** Compute the deviation of double values */ 
	public static double deviation(double[] x) {
		double[] means = new double[10];
		double m = mean(x);
		double n = 0;
		for (int i = 0; i < x.length; i++) {
			n = Math.pow((x[i] - m), 2);
			means[i] = n;
		}
		
		double total = 0;
		for (int j = 0; j < means.length; j++) {
			total += means[j];
		}
		double dev = Math.sqrt(total / (means.length - 1));
		return dev;
	}
	
	/** Compute the mean of an array of double values */
	public static double mean(double[] x) {
		double total = 0;
		double avg = 0;
		for (int i = 0; i < x.length; i++) {
			total += x[i];
		}
		avg = total / x.length;
		return avg;
	}


}

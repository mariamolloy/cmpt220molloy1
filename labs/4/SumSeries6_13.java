
public class SumSeries6_13 {

	public static void main(String[] args) {
		System.out.printf("%-10s| %10s\n", "i", "m(i)");
		for (double i = 1; i <= 20; i++) {
			System.out.printf("%-10.0f|", i);
			System.out.printf("%10.4f\n", sumSeries(i));
			
		}
	}
	
	public static double sumSeries(double n) {
		double sum = 0;
		for (double i = 1; i <= n; i++) {
			sum += i / (i + 1);
		}
		return sum;
	} 
	
}

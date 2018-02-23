import java.util.Scanner;
public class A1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//create array of amount of papers of each size
		int smallest = input.nextInt();
		int[] papers = new int[smallest];
		
		for (int i = 1; i < papers.length; i++) {
			int n = input.nextInt();
			papers[i] = n;
		}
		
		double need = 0.0;
		double next = 1.0;
		
		/* find the amount of tape needed using 
		 * tapeNeeded method and determines if 
		 * the problem is possible to complete
		 */
		for (int i = 0; i < papers.length; i++) {
			need += tapeNeeded(papers)[i] * ((double)(next / 2.0));
			
			if (papers[i] >= next) {
				next = 0;
				break;
			}
			else {
				next = (next - papers[i]) * 2;
			}
 		}

		/*if possible, prints amount of tape
		 * otherwise, prints "impossible"
		 */
		if (next == 0) {
			System.out.println(need);
		}
		else {
			System.out.println("impossible");
		}
	}
	
	/* finds the amount of tape needed in an array  
	 * given an array of amount of papers of each size
	 */
	public static double[] tapeNeeded(int[] arr) {
		double[] tapeAmt = new double[arr.length];
		for (int i = 1; i < arr.length; i++) {
			tapeAmt[i] = Math.pow(2, ((double)(-1.0 - i * 2.0)) / 4.0);
		}
		return tapeAmt;
	}

}

import java.util.Scanner;

public class Primes10_5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a positive integer: ");
		int num = input.nextInt();
		
		StackOfIntegers stack = new StackOfIntegers();
		
		double factor = 2.0;
		while (num / factor != 1){
			if (num % factor == 0) {
				//System.out.printf("%1.0f, ", factor);
				stack.push((int)factor);
				num /= (int)factor;
				
			}
			else {
				factor++;
			}
		}
		stack.push((int)factor);
		
		while (!stack.empty()) {
			System.out.print(stack.pop() + " ");
		}
		
		/*for(int i = 0; i <= stack.getSize(); i++) {
			System.out.println(stack.pop() + " ");
		} */
	
		//	System.out.printf("%1.0f",factor);
	}
}

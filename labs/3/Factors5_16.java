import java.util.Scanner;

public class Factors5_16 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		int imp = input.nextInt();
		
		double factor = 2.0;
		while ((imp / factor) != 1){
			if (imp % factor == 0) {
				System.out.printf("%1.0f, ", factor);
				imp = (int)(imp / factor);
			}
			else {
				factor++;
			}	
			
		}  
		System.out.printf("%1.0f",factor);
		

	}

}

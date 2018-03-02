import java.util.Scanner;
public class LinearEquationTest9_11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a, b, c, d, e, f: ");
		double aa = input.nextDouble();
		double bb = input.nextDouble();
		double cc = input.nextDouble();
		double dd = input.nextDouble();
		double ee = input.nextDouble();
		double ff = input.nextDouble();
		
		LinearEquation myEquation = new LinearEquation(aa, bb, cc, dd, ee, ff);
		
		if (myEquation.isSolvable()) {
			System.out.println("x = " + myEquation.getX());
			System.out.println("y = " + myEquation.getY());
		}
		else {
			System.out.println("The equation has no solution.");
		}
	}

}

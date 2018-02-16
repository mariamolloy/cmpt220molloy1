import java.util.Scanner;
public class Triangles6_19 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter three numbers as the sides of a triangle: ");
		double s1 = input.nextDouble();
		double s2 = input.nextDouble();
		double s3 = input.nextDouble();
		
		if (isValid(s1, s2, s3) == true) {
			System.out.println("The area of this triangle is: " + area(s1, s2, s3));
		}
		else {
			System.out.println("Input is invalid");
		}
	}
	
	/** Return true if the sum of every two sides is
	 * greater than the third side. */
	public static boolean isValid(double side1, double side2, double side3) {
		if ((side1 + side2 > side3) && (side2 + side3 > side1) && (side1 + side3 > side2)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	/** Return the area of the triangle. */
	public static double area(double side1, double side2, double side3) {
		double s = (side1 + side2 + side3) / 2;
		return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
				 
	}

}

import java.util.Scanner;
public class Test12_5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the sides of a triangle: ");
		double s1 = input.nextDouble();
		double s2 = input.nextDouble();
		double s3 = input.nextDouble();
		
		try {
			Triangle test = new Triangle(s1, s2, s3);
			
			System.out.println(test.toString());
			System.out.println("Area: " + test.getArea());
			System.out.println("Perimeter: " + test.getPerimeter());
		}
		catch (IllegalTriangleException ex) {
			System.out.println(ex.getMessage());
		}
	}

}

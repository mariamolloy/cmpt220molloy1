import java.util.Scanner;

public class TestTriangle11_1 {

	public static void main(String[] args) {
		Scanner  input = new Scanner(System.in);
		

		System.out.println("Enter a color:");
		String color = input.nextLine();	
		
		System.out.println("Enter side 1:");
		double s1 = input.nextDouble();
		
		System.out.println("Enter side 2:");
		double s2 = input.nextDouble();
		
		System.out.println("Enter side 3:");
		double s3 = input.nextDouble();
		
		System.out.println("Is the triangle filled? (Enter 0 for yes or 1 for no)");
		boolean filled;
		if (input.nextInt() == 0){
			filled = true;
		}
		else
			filled = false;
		
		
		
		Triangle t = new Triangle(s1, s2, s3);
		t.setColor(color);
		t.setFilled(filled);
		
		System.out.println(t.getArea());
		System.out.println(t.getPerimeter());
		System.out.println(t.getColor());
		System.out.println(t.isFilled());
	}

}


public class RectangleTest9_1 {

	public static void main(String[] args) {
		
		Rectangle rectangle1 = new Rectangle(4, 40);
		System.out.print(rectangle1.width + ", " + rectangle1.height + 
				", " + rectangle1.getArea() + ", " + rectangle1.getPerimeter() + "\n");
		
		Rectangle rectangle2 = new Rectangle(3.5, 35.9);
		System.out.print(rectangle2.width + ", " + rectangle2.height + 
				", " + rectangle2.getArea() + ", " + rectangle2.getPerimeter());
	}

}

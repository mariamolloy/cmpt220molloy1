/*creates a Circle2D object c1 (new Circle2D(2, 2, 5.5)), 
 * displays its area and perimeter, and displays the result 
 * of c1.contains(3, 3), c1.contains(new Circle2D(4, 5, 10.5)), 
 * and c1.overlaps(new Circle2D(3, 5, 2.3)).
 */


public class Circle2DTest10_11 {

	public static void main(String[] args) {
		
		Circle2D c1 = new Circle2D(2, 2, 5.5);
		
		System.out.println(c1.getArea());
		System.out.println(c1.getPerimeter());
		
		System.out.println(c1.contains(3, 3));
		System.out.println(c1.contains(new Circle2D(4, 5, 10.5)));
		System.out.println(c1.overlaps(new Circle2D(3, 5, 2.3)));

	}

}

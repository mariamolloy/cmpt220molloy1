
public class Circle2D {
	public double x = 0;
	public double y = 0;
	public double radius = 1;
	
	Circle2D(){
		
	}
	
	Circle2D(double a, double b, double r){
		x = a;
		y = b;
		radius = r;
	}
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public double getArea() {
		double a = Math.PI * radius * radius;
		return a;
	}
	
	public double getPerimeter() {
		double p = Math.PI * radius * 2.0;
		return p;
	}
	
	public boolean contains(double x, double y) {
		double d = Math.sqrt((Math.pow((x - this.x), 2) + Math.pow((y - this.y), 2)));
		if (d < this.radius)
			return true;
		else
			return false;
	}
	
	public boolean contains(Circle2D circle) {
		double d = Math.sqrt((Math.pow((circle.getX() - this.x), 2) + Math.pow((circle.getY() - this.y), 2)));
		double rad = Math.abs(this.radius - circle.getRadius());
		if (d <= rad) {
			return true;
		}
		else
			return false;
	}
	
	public boolean overlaps(Circle2D circle) {
		double d = Math.sqrt((Math.pow((circle.getX() - this.x), 2) + Math.pow((circle.getY() - this.y), 2)));
		double rad = radius + circle.getRadius();
		if (d <= rad)
			return true;
		else
			return false;
		
	}
	
}

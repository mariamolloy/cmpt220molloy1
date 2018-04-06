
public class IllegalTriangleException extends Exception {
	
	private double side1;
	private double side2;
	private double side3;
	
	IllegalTriangleException(double s1, double s2, double s3){
		super("Invalid sides " + s1 + " " + s2 + " " + s3);
		this.side1 = s1;
		this.side2 = s2;
		this.side3 = s3;
	}
	
	public double getSide1() {
		return side1;
	}
	
	public double getSide2() {
		return side2;
	}
	
	public double getSide3() {
		return side3;
	}
}

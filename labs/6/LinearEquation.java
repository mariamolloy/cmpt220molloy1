
public class LinearEquation {
	
	private double a;
	private double b;
	private double c;
	private double d;
	private double e;
	private double f;
	
	LinearEquation(double a1, double b1, double c1, double d1, double e1, double f1){
		a = a1;
		b = b1;
		c = c1;
		d = d1;
		e = e1;
		f = f1;
	}
	
	public double getA() {
		return a;
	}
	
	public double getB() {
		return b;
	}
	
	public double getC() {
		return c;
	}
	
	public double getD() {
		return d;
	}
	
	public double getE() {
		return e;
	}
	
	public double getF() {
		return f;
	}
	
	public boolean isSolvable() {
		double result = (a * d) - (b * c);
		if (result != 0) {
			return true;
		}
		return false;
	}
	
	public double getX() {
		return ((e * d) - (b * f)) / ((a * d) - (b * c));
	}
	
	public double getY() {
		return ((a * f) - (e * c)) / ((a * d) - (b * c));
	}

}


public class Rectangle {
	double width = 1;
	double height = 1;
	
	//Construct a rectangle	
	Rectangle() {
			
	}
	
	//Construct a rectangle w specified height and width
	Rectangle(double w, double h){	
		width = w;
		height = h;
	}
	
	//Get rectangle's area
	double getArea() {
		double area = height * width;
		return area;
	}
	
	//Get rectangle's perimeter
	double getPerimeter() {
		double perimeter = height * 2 + width * 2;
		return perimeter;
	}

}

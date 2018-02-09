
public class Largest5_13 {

	public static void main(String[] args) {
		int largest = 0;
		
		while (largest * largest * largest < 12000) {
			largest++;
		}
		largest -= 1;
		
		System.out.print("The largest integer who's cube is less than 12,000 is " + largest);
	}

}


public class FeetAndMeter6_9 {

	public static void main(String[] args) {
		System.out.println("Feet   Meters  | Meters    Feet \n");
		
		for (double i = 1, j = 20; i <= 10 && j <= 65; i++, j +=5) {
			System.out.printf("%1.1f %8.3f   | %3.1f %11.3f", i, footToMeter(i), j, meterToFoot(j));
			System.out.println("\n");
		}

	}
	
	
	/** Convert from feet to meters */
	public static double footToMeter(double foot) {
		return (foot * 0.305);
	}

	/** Convert from meters to feet */
	public static double meterToFoot(double meter) {
		return (meter * 3.279);
	}

}


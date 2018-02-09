
public class Conversion5_5 {

	public static void main(String[] args) {
		/*System.out.print("Kilograms	Pounds	| Pounds 	Kilograms \n");
		System.out.println("1		2.2	| 20		9.09 \n");
		System.out.println("3		6.6	| 25		11.36 \n");*/
		double rate = 2.2;
		
		System.out.println("Kilograms   Pounds  |  Pounds    Kilograms \n");
		for (double i = 1, j = 20; i <= 199 && j <= 515; i += 2, j +=5) {
			/*System.out.print(i);
			System.out.printf("%6.2f	|", (i * rate));
			System.out.printf("%9.2f", j);
			System.out.printf("%15.2f ", (j / rate));
			System.out.println("\n");*/
			
			System.out.printf("%1.0f %13.1f     | %3.0f %11.2f", i, (i * rate), j, (j / rate));
			System.out.println("\n");
		}
	}

}

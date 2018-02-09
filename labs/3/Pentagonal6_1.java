
public class Pentagonal6_1 {

	public static int getPentagonalNumber(int n) {
		return (n * (3 * n - 1)) / 2;
	}
	
	public static void main(String[] args) {
		int line = 0;
		for (int i = 1; i <= 100; i++) {
			if (line < 9) {
				System.out.printf("%7d", getPentagonalNumber(i));
				line++;
			}
			else {
				System.out.printf("%7d\n", getPentagonalNumber(i));
				line = 0;
			}
		}

	}

}

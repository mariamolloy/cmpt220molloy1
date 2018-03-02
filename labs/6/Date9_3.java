public class Date9_3 {

	public static void main(String[] args) {
		
		for (long i = 10000; i <= 1e11; i *= 10) {
			java.util.Date date1 = new java.util.Date(i);
			System.out.println(date1.toString());
		}
		
	}

}

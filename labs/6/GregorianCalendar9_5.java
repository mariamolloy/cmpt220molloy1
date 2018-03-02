import java.util.GregorianCalendar;
public class GregorianCalendar9_5 {

	public static void main(String[] args) {
		GregorianCalendar day = new GregorianCalendar();
		System.out.print(day.get(GregorianCalendar.YEAR) + " "
				+ day.get(GregorianCalendar.MONTH) + " "
				+ day.get(GregorianCalendar.DAY_OF_MONTH) + "\n");
		
		GregorianCalendar elapsed = new GregorianCalendar();
		elapsed.setTimeInMillis(1234567898765L);
		System.out.print(elapsed.get(GregorianCalendar.YEAR) + " "
				+ elapsed.get(GregorianCalendar.MONTH) + " "
				+ elapsed.get(GregorianCalendar.DAY_OF_MONTH));
		
	}

}


public class AccountTest11_3 {

	public static void main(String[] args) {
		Account a = new Account(20088592, 1500);
		Checking c = new Checking(150, 20088593, 500);
		Savings s = new Savings(20088594, 200);

		System.out.println(a.toString());
		System.out.println(c.toString());
		System.out.println(s.toString());
	}

}

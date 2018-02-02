import java.util.Scanner;

public class EnterLetter4_13 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a letter: ");
		String l = input.nextLine();
		
		int code = (int)(l.toLowerCase()).charAt(0);
		
		if ((code == 97) || (code == 101) || (code == 105) || (code == 111) || (code == 117) || (code == 121)) {
			System.out.println(l + " is a vowel.");
		}
		else if ((code > 97) && (code <= 122)) {
			System.out.println(l + " is a consonant.");
		}
		else {
			System.out.println(l + " is an invalid input");
		}
		

	}

}

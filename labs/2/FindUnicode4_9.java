import java.util.Scanner;


public class FindUnicode4_9 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a character: ");
		String c = input.nextLine();
		
		int num = (int)(c.charAt(0));
		System.out.println("The Unicode for the character " + (c.charAt(0)) + " is " + num);
		
		
	}

}

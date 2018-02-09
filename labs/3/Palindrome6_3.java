import java.util.Scanner;

public class Palindrome6_3 {
	//Return the reversal of an integer, e.g., reverse(456) returns 654 
	public static int reverse(int number) {
		String digits = "";
		int length = String.valueOf(number).length();
		String num = number + "";
		for (int i = length - 1; i >= 0; i--) {
			digits = digits + num.charAt(i);
		}
		return Integer.parseInt(digits);
	}
	
	//Return true if number is a palindrome
	public static boolean isPalindrome(int number) {
		if (number == reverse(number)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int inp = input.nextInt();
		if (isPalindrome(inp) == true) {
			System.out.println(inp + " is a palindrome!"); 
		}
		else {
			System.out.println(inp + " is not a palindrome.");
		}
		
	}
	

}

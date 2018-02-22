import java.util.Scanner;
public class HeadsAndTails8_11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number between 0 and 511: ");
		int num = input.nextInt();
		
		String bin = Integer.toString(num, 2);
		int zeroes = 9 - bin.length();
		for (int i = 0; i < zeroes; i++) {
			bin = "0" + bin;
		}
		
		char[][] coins = new char[3][3];
		int count = 0;
		for (int row = 0; row < 3; row++) {
			for (int column = 0; column < 3; column++) {
				coins[row][column] = bin.charAt(count);
				count++;
			}
		}
		
		for (int row = 0; row < coins.length; row++) {
			  for (int column = 0; column < coins[row].length; column++) {
				  if (coins[row][column] == '0')
					  System.out.print("H ");
				  else
					  System.out.print("T ");
			  }
			  System.out.println();
			}
		
	}


}

import java.util.Scanner;

public class OccurrencesOfChar18_17 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter 8 characters in one line");

    String myString = input.nextLine();
    char[] myList = new char[myString.length()];
    for (int i = 0; i < myList.length; i++) {
      myList[i] = myString.charAt(i);
    }

    System.out.println("Enter the character you want to search for");
    char search = input.next().charAt(0);

    System.out.println("The character " + search + " appears " + count(myList, search) + " times.");

  }

  public static int count(char[] chars, char ch) {
    return count(chars, ch, chars.length - 1);
  }

  public static int count(char[] chars, char ch, int high) {
    if (high < 0) {
      return 0;
    } else if (ch == chars[high]) {
      return 1 + count(chars, ch, high - 1);
    } else {
      return count(chars, ch, high - 1);
    }
  }
}


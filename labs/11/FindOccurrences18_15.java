public class FindOccurrences18_15 {

  public static void main(String[] args) {
    String myString = "she sells sea shells by the sea shore";
    char myChar = 's';
    System.out.println("The character " + myChar + " appears in the string " + myString + " " +
        count(myString, myChar) + " times.");
  }

  public static int count(String str, char a) {
    return count(str, a, str.length() - 1);
  }

  public static int count(String str, char a, int high) {
    if (high < 0) {
      return 0;
    } else if (str.charAt(high) == a) {
      return 1 + count(str, a, high - 1);
    } else {
      return count(str, a, high - 1);

    }
  }


}

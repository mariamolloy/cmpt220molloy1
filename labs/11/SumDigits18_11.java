public class SumDigits18_11 {

  public static void main(String[] args) {
    System.out.println("The sum of the digits of 234 is " + sumDigits(234));
    System.out.println("The sum of the digits of 1000 is " + sumDigits(1000));
    System.out.println("The sum of the digits of 599 is " + sumDigits(599));
    System.out.println("The sum of the digits of 123456789 is " + sumDigits(123456789));
    System.out.println("The sum of the digits of 10 is " + sumDigits(10));
  }

  public static int sumDigits(long n) {
    return sumDigits(n, 0);
  }

  private static int sumDigits(long n, int sum) {
    if (n == 0) {
      return sum;
    } else {
      sum += (n % 10);
      return sumDigits((int) n / 10, sum);
    }
  }


}

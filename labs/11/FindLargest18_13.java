import java.util.Scanner;

public class FindLargest18_13 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Please enter 8 integers:");
    int[] arr = new int[8];
    for (int i = 0; i < 8; i++) {
      arr[i] = input.nextInt();
    }

    System.out.println("The largest integer in your list is " + findLargest(arr));
  }

  public static int findLargest(int[] a) {
    return findLargest(a, a[a.length - 1], a.length - 1);
  }

  public static int findLargest(int[] a, int max, int index) {
    if (index < 0) {
      return max;
    } else if (max > a[index]) {
      return findLargest(a, max, index - 1);
    } else {
      return findLargest(a, a[index], index - 1);
    }
  }


}

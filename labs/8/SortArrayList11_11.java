import java.util.ArrayList;
import java.util.Scanner;

public class SortArrayList11_11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 5 integers: ");
		ArrayList<Integer> myList = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			myList.add(input.nextInt());
		}
		
		sort(myList);
		
		System.out.println(myList.toString());

	}
	
	public static void sort(ArrayList<Integer> list) {
		int temp;
		
		for (int j = list.size(); j >= 0; j--) {
			for (int i = 0; i < list.size() - 1; i++) {
				if (list.get(i) > list.get(i + 1)) {
					temp = list.get(i);
					list.set(i, list.get(i + 1));
					list.set(i + 1, temp);
				}
			}
		}	
	} 


}

import java.io.*;
import java.util.*;

public class RemoveText12_11 {
	public static void main(String[] args) throws Exception {
		if (args.length != 2) {
			System.out.println("Usage: java RemoveText filename");
			System.exit(1);
		}
		
		File myFile = new File(args [1]);
		if (myFile.exists() == false) {
			System.out.println("File " + args[1] + " does not exist");
			System.exit(2);
		}
		
		ArrayList<String> arr = new ArrayList<>();
		
		try (Scanner input = new Scanner(myFile)){
			while (input.hasNext()) {
				String str = input.nextLine();
				arr.add(removeText(args[0], str));
			}
		}
		try (PrintWriter txt = new PrintWriter(myFile)){
			for (int i = 0; i < arr.size(); i++) {
				txt.println(arr.get(i));
			}
		}
	}
	
	public static String removeText(String str, String line) {
		StringBuilder myString = new StringBuilder(line);
		int start = myString.indexOf(str);
		int end = 0;
		
		while (start >= 0) {
			end = start + end;
			myString = myString.delete(start, end);
			start = myString.indexOf(str, start);
		}
		return myString.toString();
	}

}

import java.util.*;
import java.io.*;

public class Count12_13 {

	public static void main(String[] args) throws Exception{
		int chars = 0;
		int words = 0;
		int lines = 0;
		
		if (args.length != 1) {
			System.out.println("Usage: java filename");
			System.exit(1);
		}
		
		File myFile = new File(args[0]);
		if (myFile.exists() == false) {
			System.out.println("File " + args[0] + " does not exist");
			System.exit(2);
		}
		
		String line;
		
		try (Scanner input = new Scanner(myFile)){
			while (input.hasNext()) {
				line = input.nextLine();
				chars += line.length();
				lines++;
			}
		}
		
		try (Scanner input = new Scanner(myFile)){
			while (input.hasNext()) {
				line = input.next();
				words++;
			}
		}
		
		System.out.println("File " + myFile.getName() + " has");
		System.out.println(chars + " characters");
		System.out.println(words + " words");
		System.out.println(lines + " lines");

	}

}

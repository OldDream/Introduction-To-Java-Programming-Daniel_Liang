import java.io.*;
import java.util.Scanner;

public class Exercise12_13 {
	public static void main(String[] args) {
		if (args.length != 1) {
			System.out.println("Invalid Input!");
			System.exit(1);
		}

		File file = new File(args[0]);
		if (!file.exists()) {
			System.out.println("File does not exist!");
			System.exit(1);
		}

		int lines = 0, words = 0, chars = 0;

		try (Scanner filein = new Scanner(file)) {
			while (filein.hasNext()) {
				String a = filein.nextLine();
				lines++;
				chars += a.length();
				String[] b = a.split(" ");
				words += b.length;

			}
		}
		catch (FileNotFoundException ex) {
			ex.printStackTrace();
		}
	}
}
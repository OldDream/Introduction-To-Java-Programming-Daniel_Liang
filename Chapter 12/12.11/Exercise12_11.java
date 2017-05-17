import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;
import java.io.FileNotFoundException;

public class Exercise12_11 {
	public static void main(String[] args) {
		File originalfile = new File("allah");
		if (args.length != 2) {
			System.out.println("Invalid input.");
			System.exit(1);
		}

		if (!originalfile.exists()) {
			System.out.println(args[1] + " does not exist.");
			System.exit(1);
		}

		String tempStr = "";
		try (Scanner fileinput = new Scanner(originalfile)) {
			while (fileinput.hasNext()) {
				tempStr += fileinput.nextLine();
			}
		}
		catch (FileNotFoundException ex) {
			ex.printStackTrace();
		}

		tempStr = tempStr.replaceAll(args[0], "");
		try (PrintWriter output = new PrintWriter(originalfile)) {
			System.out.println(tempStr);
			output.print(tempStr);
		}
		catch (FileNotFoundException ex) {
			ex.printStackTrace();
		}
	}
}
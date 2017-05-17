import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;
import java.io.FileNotFoundException;

public class Exercise12_12 {
	public static void main(String[] args) {
		if (args.length != 1) {
			System.out.println("Invalid input.");
			System.exit(1);
		}
		File originalfile = new File(args[0]);

		if (!originalfile.exists()) {
			System.out.println(args[1] + " does not exist.");
			System.exit(1);
		}

		StringBuilder strBuffer = new StringBuilder();
		try (Scanner fileinput = new Scanner(originalfile)) {
			while (fileinput.hasNext()) {
				String s = fileinput.nextLine();
				if (s.contains("{"))
					strBuffer.append(" {");
				else 
					strBuffer.append("\n" + s);
			}
		}
		catch (FileNotFoundException ex) {
			ex.printStackTrace();
		}

		try (PrintWriter output = new PrintWriter(originalfile)) {
			System.out.println(strBuffer.toString());
			output.print(strBuffer.toString());
			System.out.println("\n" + "------ output finished ------");
		}
		catch (FileNotFoundException ex) {
			ex.printStackTrace();
		}
	}
}
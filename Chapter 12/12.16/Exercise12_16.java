import java.util.*;
import java.io.*;

public class Exercise12_16 {
	public static void main(String[] args) {
		if (args.length != 3) {
			System.out.println("Invalid input.");
			System.exit(1);
		}

		File sorce = new File(args[0]);
		if (!sorce.exists()) {
			System.out.println("File not exist.");
			System.exit(1);
		}

		StringBuffer temp = new StringBuffer();
		try {
			Scanner in = new Scanner(sorce);
			while (in.hasNext()) {
				temp.append(in.nextLine());
				if (in.hasNext())
					temp.append("\n");
			}

			String output = (temp.toString()).replaceAll(args[1], args[2]);
			
			PrintWriter pw = new PrintWriter(sorce);
			pw.print(output);
			pw.close();
		}
		catch (FileNotFoundException ex) {
			ex.printStackTrace();
		}
	}
}
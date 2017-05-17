import java.util.*;
import java.io.*;

public class Exercise12_22 {
	public static void main(String[] args) {
		if (args.length != 3) {
			System.out.println("Invalid input.");
			System.exit(1);
		}

		File sorce = new File(args[0]);
		if (!sorce.exists() || !sorce.isDirectory()) {
			System.out.println("Directory not exist.");
			System.exit(1);
		}


		File[] list = sorce.listFiles();
		for (int i = 0; i < list.length; i++) {
			if (list[i].isFile()) {
				try {
					StringBuffer temp = new StringBuffer();
					Scanner in = new Scanner(list[i]);
					while (in.hasNext()) {
						temp.append(in.nextLine());
						if (in.hasNext())
							temp.append("\n");
					}

					String output = (temp.toString()).replaceAll(args[1], args[2]);
			
					PrintWriter pw = new PrintWriter(list[i]);
					pw.print(output);
					pw.close();
				}
				catch (FileNotFoundException ex) {
					ex.printStackTrace();
				}
			}
		}
	}
}
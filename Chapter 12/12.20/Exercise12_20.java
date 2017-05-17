import java.io.*;
import java.util.*;

public class Exercise12_20 {
	public static void main(String[] args) {
		if (args.length != 1) {
			System.out.println("Invalid input.");
			System.exit(1);
		}

		try {
			File src = new File(args[0]);
			File[] te = src.listFiles();
			for (int h = 0; h < te.length; h++) {
				if (te[h].isDirectory() && te[h].getName().matches("chapter[\\d]*")) {    //找出符合名称的文件夹。
					File[] inside = te[h].listFiles();
					for (int j = 0; j < inside.length; j++) {
						if (inside[j].isFile() && inside[j].getName().matches(".*java")) {    //找出后缀是java的文件，后面才正式开始改写。
							StringBuilder strBuffer = new StringBuilder();
							Scanner fileinput = new Scanner(inside[j]);
							//检测第一行是不是package。。。。。。
							String sb = fileinput.nextLine();
							if (!sb.matches("package chapter[\\d]*;"))
								continue;
//							strBuffer.append("package " + te[h].getName() + ";\n");
							while (fileinput.hasNext()) {
								String s = fileinput.nextLine();
								strBuffer.append(s + "\n");
							}

							fileinput.close();

							PrintWriter fileoutput = new PrintWriter(inside[j]);
							fileoutput.print(strBuffer.toString());

							fileoutput.close();
							System.out.println(te[h].getName() + " \\ " + inside[j].getName() + " has been modified.");
						}
					}
				}
			}
		}
		catch (FileNotFoundException ex) {
			ex.printStackTrace();
		}
	}
}

/*
			for (File a : te) {
				System.out.println(a.getName());
*/
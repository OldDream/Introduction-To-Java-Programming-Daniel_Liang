import java.io.*;
import java.util.*;

public class Exercise12_27 {
	public static void main(String[] args) throws FileNotFoundException {
		for (int i = 0; i < args.length; i++) {
			if (args[i].matches("Exercise12_27.[\\w]*")) {
				System.out.println("------SkipFile[Exercise12_27.****]------");
			}
			else {
				File tempfile = new File(args[i]);
				if (tempfile.isFile()) {
					System.out.println("---" + tempfile.getName() + " would be modify.");
					readAndWrite(tempfile);
				}
				else 
					System.out.println("------" + tempfile.getName() + " was not a file,skip.");
			}
		}
	}

	public static void readAndWrite(File file) throws FileNotFoundException {
		ArrayList<String> tempLine = new ArrayList<>();    //这样做的目的是在写入到文件的时候方便换行。
		try (Scanner filein = new Scanner(file)) {
			while (filein.hasNext()) {
				String str = filein.nextLine();
				if (str.contains("Exercise")) {
					str = replaceWords(str);
					tempLine.add(str);
				}
				else {
					tempLine.add(str);
				}
			}
		}

		try (PrintWriter fileout = new PrintWriter(file)) {
			for (String a : tempLine) {
				fileout.println(a);    //利用println完成换行
			}
		}
	}

	public static String replaceWords(String str) {
		String[] tempStrA = str.split(" ");
		StringBuilder tsb = new StringBuilder();
		for (int i = 0; i < tempStrA.length; i++) {
			if (tempStrA[i].matches("Exercise[\\d]_[\\d]")) {
				StringBuilder temp = new StringBuilder(tempStrA[i]);
				temp.insert(tempStrA[i].length() - 1, "0");
				temp.insert(8, "0");
				tsb.append(temp.toString() + " ");
			}
			else if (tempStrA[i].matches("Exercise[\\d]_[\\d]{2}")) {
				StringBuilder temp = new StringBuilder(tempStrA[i]);
				temp.insert(8, "0");
				tsb.append(temp.toString() + " ");
			}
			else if (tempStrA[i].matches("Exercise[\\d]{2}_[\\d]")) {
				StringBuilder temp = new StringBuilder(tempStrA[i]);
				temp.insert(tempStrA[i].length() - 1, "0");
				tsb.append(temp.toString() + " ");
			}
			else {
				tsb.append(tempStrA[i] + " ");
			}
		}
		tsb.deleteCharAt(tsb.length() - 1);    //删除最后的空格
		return tsb.toString();
	}
}
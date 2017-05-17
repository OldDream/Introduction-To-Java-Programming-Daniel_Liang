import java.io.*;

public class Exercise12_28 {
	public static void main(String[] args) {
		for (int i = 0; i < args.length; i++) {
			replaceName(args[i]);
		}
	}

	public static void replaceName(String name) {
		if (name.matches("Exercise[\\d]_[\\d]*.*")) {
			StringBuilder temp = new StringBuilder(name);
			temp.insert(8, "0");
			File reFile = new File(temp.toString());
			File oldFile = new File(name);
			oldFile.renameTo(reFile);
			System.out.println(name + " has been renamed to " + reFile.getName());
		}
	}
}
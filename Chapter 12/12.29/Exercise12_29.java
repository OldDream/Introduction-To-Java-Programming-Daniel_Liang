import java.io.*;

public class Exercise12_29 {
	public static void main(String[] args) {
		for (int i = 0; i < args.length; i++) {
			replaceName(args[i]);
		}
	}

	public static void replaceName(String name) {
		if (name.matches("Exercise[\\d]*_[\\d]{1}[\\W].*")) {
			StringBuilder temp = new StringBuilder(name);
			temp.insert(name.indexOf('.') - 1, "0");		//大爷的往哪里插啊。
			File reFile = new File(temp.toString());
			File oldFile = new File(name);
			oldFile.renameTo(reFile);
			System.out.println(name + " has been renamed to " + reFile.getName());
		}
		else if (name.matches("Exercise[\\d]*_[\\d]{1}")) {
			StringBuilder temp = new StringBuilder(name);
			temp.insert(name.length() - 1, "0");		//大爷的往哪里插啊。made搞定了
			File reFile = new File(temp.toString());
			File oldFile = new File(name);
			oldFile.renameTo(reFile);
			System.out.println(name + " has been renamed to " + reFile.getName());
		}
	}
}
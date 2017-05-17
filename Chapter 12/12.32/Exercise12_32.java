import java.io.*;
import java.util.*;

public class Exercise12_32 {
	public static void main(String[] args) {
		ArrayList<String> title = new ArrayList<>();
		title.add("Year   ");
		for (int i = 1; i <= 5; i++) {
			title.add("Rank" + i + "      ");
		}
		for (int i = 1; i <= 5; i++) {
			title.add("Rank" + i + "      ");
		}

		for(int i = 0; i < title.size(); i++) {
			System.out.print(title.get(i));
		}
		System.out.println();

		File file2 = new File("babynameranking2014.txt");
		File file1 = new File("babynameranking2015.txt");

		printER(file1);
		printER(file2);
	}

	public static void printER(File file) {
		StringBuilder sb = new StringBuilder(file.getName());
		String sub = sb.substring(15, 19);
		System.out.print(sub + "   ");	//print year.

		//Print the name of female.
		try (Scanner filein = new Scanner(file)) {
			for (int i = 0; i < 5; i++) {
				printName(filein.nextLine(), "F");
			}
			for (int i = 0; i < 5; i++) {
				printName(filein.nextLine(), "M");
			}
			System.out.println();    //最后换行用
		}
		catch (FileNotFoundException ex) {
			ex.printStackTrace();
		}
	}

	public static void printName(String tempstr, String gender) {
		Scanner tempsc = new Scanner(tempstr);
		int rank = tempsc.nextInt();	//后面字符串里只有四个子串了啊！！！读走一个了！！！
		ArrayList<String> array = new ArrayList<>();
		while (tempsc.hasNext())
			array.add(tempsc.next());
		if (gender.equals("F")) {
			System.out.printf("%-11s", array.get(2));
		}
		else if (gender.equals("M")) {
			System.out.printf("%-11s", array.get(0));
		}
	}
}
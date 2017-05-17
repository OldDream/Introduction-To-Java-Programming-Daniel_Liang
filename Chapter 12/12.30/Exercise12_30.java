import java.util.*;
import java.io.*;

public class Exercise12_30 {
	public static void main(String[] args) {
		int[] upper = new int[26], lower = new int[26];
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a filename: ");
		String fileName = input.next();

		File file = new File(fileName);
		try (Scanner fileIn = new Scanner(file)) {
			while(fileIn.hasNext()) {
				String sb = fileIn.nextLine();
				countNumber(sb, upper, lower);
			}
		}
		catch (FileNotFoundException ex) {
			ex.printStackTrace();
		}

		//打印出结果。
		for (int i = 0, j = 'A'; i < upper.length; i++, j++) {
			System.out.println("Number of " + (char)j +" is : " + upper[i]);
		}

		for (int i = 0, j = 'a'; i < lower.length; i++, j++) {
			System.out.println("Number of " + (char)j +" is : " + lower[i]);
		}
	}

	public static void countNumber(String sb, int[] upper, int[] lower) {
		for (int i = 0; i < sb.length(); i++) {
			char ch = sb.charAt(i);
			if (ch >= 65 && ch <= 90) {
				upper[ch - 'A']++;
			}
			else if (ch >= 97 && ch <= 122) {
				lower[ch - 'a']++;
			}
			else
				continue;
		}

	}
}
import java.io.*;
import java.util.Scanner;

public class Exercise12_14 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a file:");
		String name = input.next();
		File scoreFile = new File(name);

		if (!scoreFile.exists()) {
			System.out.print("File doesn't exist.");
			System.exit(1);
		}

		int sum = 0, num = 0;

		try (Scanner fileScan = new Scanner(scoreFile)) {
			while (fileScan.hasNext()) {
				sum += fileScan.nextInt();
				num++;
			}
		}
		catch (FileNotFoundException ex) {
			ex.printStackTrace();
		}

		System.out.println("Sum is " + sum);
		System.out.println("Average is " + (double)sum / num);
	}
}
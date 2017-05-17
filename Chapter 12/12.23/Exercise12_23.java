import java.net.*;
import java.util.Scanner;
import java.io.IOException;

public class Exercise12_23 {
	public static void main(String[] args) {
		try {
			URL scores = new URL("http://cs.armstrong.edu/liang/data/Scores.txt");
			int count = 0;
			Scanner webin = new Scanner(scores.openStream());
			while (webin.hasNext()) {
				webin.nextDouble();
				count++;
			}
			System.out.println("This txt has " + count + " scores.");

		}
		catch (IOException ex ) {
			ex.printStackTrace();
		}
	}
}
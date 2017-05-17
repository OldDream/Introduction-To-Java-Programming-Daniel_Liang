import java.net.*;
import java.util.Scanner;
import java.io.IOException;

public class Exercise12_19 {
	public static void main(String[] args) {
		try {
			URL lincoln = new URL("http://cs.armstrong.edu/liang/data/Lincoln.txt");
			int count = 0;
			Scanner webin = new Scanner(lincoln.openStream());
			while (webin.hasNext()) {
				webin.next();
				count++;
			}
			System.out.println("Lincoln's speech in Gettysburg has " + count + " words.");

		}
		catch (IOException ex ) {
			ex.printStackTrace();
		}
	}
}
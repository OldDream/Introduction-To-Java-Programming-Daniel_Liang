import java.util.*;
import java.io.*;

public class Random100 {
	public static void main(String[] args) {
		File file = new File("Exercise12_15.txt");
		if (file.exists()) {
			System.out.println("\"Exercise12_15.txt\" already exist.");
			System.exit(1);
		}

		try (PrintWriter pw = new PrintWriter(file)) {
			for(int i = 0; i < 100; i++) {
				pw.print((int)(Math.random() * 100));
				pw.print(' ');
			}
		}
		catch (FileNotFoundException ex) {
			ex.printStackTrace();
		}
		try (Scanner filein = new Scanner(file)) {
			ArrayList<Integer> al = new ArrayList<>();

			while(filein.hasNext()) {
				al.add(filein.nextInt());
			}

			Collections.sort(al);

			for (int i = 0; i < al.size(); i++) {
				System.out.print(al.get(i) + " ");
				if ((i == 9) || ((i - 9) % 10 == 0 && i != 9))
					System.out.println();	
			}
			System.out.println();
		}
		catch (FileNotFoundException ex) {
			ex.printStackTrace();
		}
	}	
}
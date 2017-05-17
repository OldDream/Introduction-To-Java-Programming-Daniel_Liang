import java.io.*;
import java.util.*;

public class Exercise12_31 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the year: ");
		int year = input.nextInt();
		StringBuilder sb = new StringBuilder("babynameranking");
		sb.append(year);
		sb.append(".txt");
		File file = new File(sb.toString());

		System.out.print("Enter the gender: ");
		char gender = input.next().toUpperCase().charAt(0);

		System.out.print("Enter the name: ");
		String name = input.next();

		try (Scanner filein = new Scanner(file)) {
			while (filein.hasNext()) {
				String tempstr = filein.nextLine();
				if (tempstr.contains(name)) {
					findRank(gender, tempstr, name, year);
				}
			}
			System.out.println(name + " is not ranked in year " + year + ".");
		}
		catch (FileNotFoundException ex) {
			System.out.println("We don't have the data of this year.");
			ex.printStackTrace();
		}
	}

	public static void findRank(char gender, String tempstr, String name, int year) {
		Scanner tempsc = new Scanner(tempstr);
		int rank = tempsc.nextInt();	//后面字符串里只有四个子串了啊！！！读走一个了！！！
		ArrayList<String> array = new ArrayList<>();
		while (tempsc.hasNext())
			array.add(tempsc.next());
		for (int i = 0; i < array.size(); i++) {
			if (array.get(i).equals(name)) {
				if (gender == 'M' && i == 2) {
					System.out.println("Errror gender.");
					return;
				}
				else if (gender == 'F' && i == 0) {
					System.out.println("Errror gender.");
					return;
				}
				else {
					System.out.println(name + " is in rank #" + rank + " in year " + year + ".");
					System.exit(0);
				}
			}
		}
				
	}
}
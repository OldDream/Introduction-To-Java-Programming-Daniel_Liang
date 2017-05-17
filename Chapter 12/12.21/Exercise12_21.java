import java.util.*;
import java.io.*;

public class Exercise12_21 {
	public static void main(String[] args) {
		File file = new File("SortedString.txt");
		try {
			Scanner filein = new Scanner(file);
			ArrayList<String> str = new ArrayList<>();
			
			while (filein.hasNext()) {
				str.add(filein.next());
			}
			ArrayList<String> str1 = new ArrayList<>(str);
			Collections.sort(str1);	
			
			if (!str.equals(str1)) {
				System.out.println("The file has not been sort.");
				System.out.println(str.get(0));
				System.out.println(str.get(1));
			}
			else {
				System.out.println("The file has been sorted.");
			}
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
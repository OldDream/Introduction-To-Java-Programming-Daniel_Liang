import java.util.*;

public class Test {
	public static void main(String[] args) {
		String a = "1 aaa      bbb cccc           d";
		Scanner filein = new Scanner(a);
		ArrayList<String> c = new ArrayList<>();
		while(filein.hasNext()) {
			c.add(filein.next());
		}
		System.out.println(c.size());
	}
}
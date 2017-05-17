import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("Dallas");
		list.add("Dallas");
		list.add("Houston");
		list.add("Dallas");

		while (list.contains("Dallas"))
			list.remove("Dallas");

		System.out.printf(list.toString());	
	}
}
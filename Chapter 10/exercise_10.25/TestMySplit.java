public class TestMySplit {
	public static void main(String[] args) {
		String[] test = MySplit.split("aaacaaadaaac", "[cd]");
		for (String a : test)
			System.out.println(a);
	}
}
public class review_10_32 {
	public static void main(String[] args) {
		String s = "Java";
		StringBuilder builder = new StringBuilder(s);
		change(s, builder);

		//s = s + " and HTML.";
		System.out.println(s);
		System.out.println(builder.toString());
	}

	private static void change(String s, StringBuilder builder) {
		s = s + " and HTML.";
		builder.append(" and HTML.");
	}
}
public class TestMyStringBuilder1 {
	public static void main(String[] args) {
		MyStringBuilder1 a = new MyStringBuilder1("012345");
		MyStringBuilder1 b = new MyStringBuilder1("aaa");
		MyStringBuilder1 c = a.insert(2, b);
		System.out.println(c.toString());
	}
}
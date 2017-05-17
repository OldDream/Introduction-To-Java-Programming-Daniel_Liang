public class MyCharacter {
	char ch;
	public MyCharacter(char c) {
		ch = c;
	}

	public static MyCharacter valueOf(char c) {
		return new MyCharacter(c);
	}
}
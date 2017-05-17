public class MyString1 {
	private StringBuilder temp = new StringBuilder();

	public MyString1(char[] chars) {
		temp = temp.append(chars);
	}

	public char charAt(int index) {
		return temp.charAt(index);
	}

	public int length() {
		return temp.length();
	}

	public MyString1 substring(int begin, int end) {
		char[] tempch = temp.substring(begin, end).toCharArray();
		return new MyString1(tempch);
	}

	public MyString1 toLowerCase() {
		char[] tempch = temp.toString().toLowerCase().toCharArray();
		return new MyString1(tempch);
	}

	public boolean equals(MyString1 s) {
		if (temp.length() != s.length())
			return false;
		else
			for (int i = 0; i < temp.length(); i++) {
				if (temp.charAt(i) != s.charAt(i))
					return false;
			}
		return true;
	}

	public static MyString1 valueOf(int i) {
		String aaa = String.valueOf(i);
		char[] ch = new char[aaa.length()];
		for (int j = 0; j < aaa.length(); j++) {
			ch[j] = aaa.charAt(j);
		}
		return new MyString1(ch);
	}
}
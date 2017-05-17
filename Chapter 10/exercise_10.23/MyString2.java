public class MyString2 {
	private StringBuilder temp = new StringBuilder();

	public MyString2(String s) {
		temp = temp.append(s);
	}

	public char charAt(int index) {
		return temp.charAt(index);
	}

	public int length() {
		return temp.length();
	}

	public MyString2 substring(int begin, int end) {
		String tempch = temp.substring(begin, end);
		return new MyString2(tempch);
	}
////////////////////////
	public MyString2 toLowerCase() {
		String tempch = temp.toString().toLowerCase();
		return new MyString2(tempch);
	}

	public boolean equals(MyString2 s) {
		if (temp.length() != s.length())
			return false;
		else
			for (int i = 0; i < temp.length(); i++) {
				if (temp.charAt(i) != s.charAt(i))
					return false;
			}
		return true;
	}

	public static MyString2 valueOf(int i) {
		String aaa = String.valueOf(i);
		return new MyString2(aaa);
	}
}
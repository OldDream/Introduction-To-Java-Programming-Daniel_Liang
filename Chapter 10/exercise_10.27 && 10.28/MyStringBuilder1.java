public class MyStringBuilder1 {
	private char[] storage;

	public MyStringBuilder1(char[] s) {
		storage = new char[s.length];
		System.arraycopy(s, 0, storage, 0,s.length);
	}

	public MyStringBuilder1(String s) {
		this(s.toCharArray());
	}

	public MyStringBuilder1() {
		this("");
	}

	public String toString() {
		return new String(storage);
	}

	public int length() {
		return storage.length;
	}

	public char charAt(int index) {
		return storage[index];
	}

	public MyStringBuilder1 append(int i) {
		String temp = "";
		if (i > 9) {
			int insert = i % 10;
			while(i > 0) {
				temp += ("" + insert);
				i /= 10;
				insert = i % 10;
			}
		}
		else
			temp += ("" + i);
		return new MyStringBuilder1(toString() + temp);
	}

	public  MyStringBuilder1 append(MyStringBuilder1 s) {
		return new MyStringBuilder1(toString() + s.toString());
	}

	public MyStringBuilder1 toLowerCase() {
		for (int i = 0; i < storage.length; i++) {
			char temp = storage[i];
			if (temp >= 'A' && temp <= 'Z') {
				temp = (char)(temp - 'A' + 'a');
				storage[i] = temp;
			}
		}
		return new MyStringBuilder1(toString());
	}

	public MyStringBuilder1 toUpperCase() {
		for (int i = 0; i < storage.length; i++) {
			char temp = storage[i];
			if (temp >= 'a' && temp <= 'z') {
				temp = (char)(temp - 'a' + 'A');
				storage[i] = temp;
			}
		}
		return new MyStringBuilder1(toString());
	}

	public MyStringBuilder1 substring(int begin, int end) {
		char[] temp = new char[end - begin];
		for (int i = begin; i < end; i++)
			temp[i - begin] = storage[i];

		return new MyStringBuilder1(temp);
	}

	public MyStringBuilder1 substring(int begin) {
		return substring(begin, storage.length);
	}

	public MyStringBuilder1 reverse() {
		char[] rev = new char[storage.length];
		for (int i = 0; i < storage.length; i++)
			rev[i] = storage[storage.length - i - 1];
		return new MyStringBuilder1(rev);
	}

	public MyStringBuilder1 insert(int offset, MyStringBuilder1 s) {
		char[] aaa = s.toString().toCharArray();
		char[] temp = new char[length() + aaa.length];
		
		System.arraycopy(storage, 0, temp, 0, offset);
		System.arraycopy(aaa, 0, temp, offset, s.length());
		System.arraycopy(storage, offset, temp, s.length() + offset, length() - offset);

		return new MyStringBuilder1(temp);
	}

}
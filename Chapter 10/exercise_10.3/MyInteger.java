public class MyInteger {
	private int value;

	public MyInteger(int num) {
		this.value = num;
	}
	public int getInteger() {
		return value;
	}
	public boolean isEven() {
		if (this.value % 2 == 0)
			return true;
		else 
			return false;
	}
	public boolean isOdd() {
		if (this.value % 2 == 1)
			return true;
		else
			return false;
	}
	public boolean isPrime() {
		for (int i = 2; i < this.value; i++) {
			if (this.value % i == 0)
				return false;
		}
		return true;
	}
//------------------------------------
	public static boolean isEven(int value) {
		if (value % 2 == 0)
			return true;
		else 
			return false;
	}
	public static boolean isOdd(int value) {
		if (value % 2 == 1)
			return true;
		else
			return false;
	}
	public static boolean isPrime(int value) {
		for (int i = 2; i < value; i++) {
			if (value % i == 0)
				return false;
		}
		return true;
	}
//------------------------------------
	public static boolean isEven(MyInteger a) {
		if (a.value % 2 == 0)
			return true;
		else 
			return false;
	}
	public static boolean isOdd(MyInteger a) {
		if (a.value % 2 == 1)
			return true;
		else
			return false;
	}
	public static boolean isPrime(MyInteger a) {
		for (int i = 2; i < a.value; i++) {
			if (a.value % i == 0)
				return false;
		}
		return true;
	}	
//------------------------------------
	public boolean equals(int a) {
		if (this.value == a)
			return true;
		else
			return false;
	}

	public boolean equals(MyInteger a) {
		if (this.value == a.value)
			return true;
		else
			return false;
	}

	public static int parseInt(char[] a) {
		int num = 0;
		for (int i = 0; i < a.length; i++) {
			num += (a[i] - '0') * Math.pow(10, a.length - 1 - i);
		}
		return num;
	}

	public static int parseInt(String a) {
		int num = 0;
		for (int i = 0; i < a.length(); i++) {
			num += (a.charAt(i) - '0') * Math.pow(10, a.length() - 1 - i);
		}
		return num;
	}	

}
public class TestMyInteger {
	public static void main(String[] args) {
		System.out.println(MyInteger.parseInt("12345"));
		System.out.println(MyInteger.isPrime(3));
		MyInteger a = new MyInteger(6);
		System.out.println(a.isEven());
	}
}
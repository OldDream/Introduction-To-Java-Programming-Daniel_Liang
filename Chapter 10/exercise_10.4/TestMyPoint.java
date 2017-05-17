public class TestMyPoint {
	public static void main(String[] args) {
		MyPoint a = new MyPoint();
		MyPoint b = new MyPoint(3, 4);
		System.out.println(a.distance(3, 4));
		System.out.println(a.distance(b));
	}
}
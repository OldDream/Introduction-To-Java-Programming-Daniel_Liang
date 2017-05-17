public class TestMyRectangle2D {
	public static void main(String[] args) {
		MyRectangle2D rec1 = new MyRectangle2D();
		System.out.println("Area " + rec1.getArea());
		System.out.println("Perimeter " + rec1.getPerimeter());
		System.out.println("Point(0, 0.25) contains ? " + rec1.contains(0, 0.25));
		
	}
}
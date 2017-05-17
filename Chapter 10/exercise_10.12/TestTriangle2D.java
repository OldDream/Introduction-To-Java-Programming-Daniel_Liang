public class TestTriangle2D {
	public static void main(String[] args) {
		Triangle2D tr1 = new Triangle2D(new MyPoint(0, 0), new MyPoint(2, 4), new MyPoint(0, 4));
		System.out.println("Area " + tr1.getArea());
		System.out.println("Perimeter " + tr1.getPerimeter());
		System.out.println("Contains " + tr1.contains(new MyPoint(2, 3)));
	}
}
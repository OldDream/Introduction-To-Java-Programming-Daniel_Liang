public class TestCircle2D {
	public static void main(String[] args) {
		Circle2D c1 = new Circle2D(2, 2, 5.5);
		System.out.println("C1's Area is " + c1.getArea());
		System.out.println("C1's perimeter is " + c1.getPerimeter());
		System.out.println("contains xy " + c1.contains(3, 3));
		System.out.println("contains circle " + c1.contains(new Circle2D(4, 5, 10.5)));
		System.out.println("Overlaps " + c1.overlaps(new Circle2D(3, 5, 2.3)));
	}
}
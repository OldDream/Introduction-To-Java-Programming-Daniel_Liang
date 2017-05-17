public class TestRectangle {
	public static void main(String[] args) {
		Rectangle rec1 = new Rectangle(4, 40);
		Rectangle rec2 = new Rectangle(3.5, 35.9);

		System.out.println("The width of rec1 is " + rec1.width);
		System.out.println("The height of rec1 is " + rec1.height);
		System.out.println("The area of rec1 is " + rec1.getArea());
		System.out.println("The perimeter of rec1 is " + rec1.getPerimeter());

		System.out.println("The width of rec2 is " + rec2.width);
		System.out.println("The height of rec2 is " + rec2.height);
		System.out.println("The area of rec2 is " + rec2.getArea());
		System.out.println("The perimeter of rec2 is " + rec2.getPerimeter());
	}
}
public class TestRegularPolygon {
	public static void main(String[] args) {
		RegularPolygon polygon1 = new RegularPolygon();
		RegularPolygon polygon2 = new RegularPolygon(6, 4);
		RegularPolygon polygon3 = new RegularPolygon(10, 4, 5.6, 7.8);

		System.out.println("The perimeter of polygon1 is " + polygon1.getPerimeter() + 
			" and the area is " + polygon1.getArea());
		System.out.println("The perimeter of polygon2 is " + polygon2.getPerimeter() + 
			" and the area is " + polygon2.getArea());
		System.out.println("The perimeter of polygon3 is " + polygon3.getPerimeter() + 
			" and the area is " + polygon3.getArea());
	}
}
import java.util.*;

public class TestTriangle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter side1 ~ 3:");
		double side1 = input.nextDouble();
		double side2 = input.nextDouble();
		double side3 = input.nextDouble();
		System.out.print("Color : ");
		String color = input.next();
		System.out.print("Filled? (true or flase): ");
		boolean filled = input.nextBoolean();

		try {
			Triangle tri = new Triangle(side1, side2, side3);
			tri.setColor(color);
			tri.setFilled(filled);
			System.out.println(tri.toString());
			System.out.println("Area is " + tri.getArea());
			System.out.println("Perimeter is " + tri.getPerimeter());
			System.out.println("Color is " + tri.getColor());
			System.out.println("Is Filled ? : " + tri.isFilled());
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}

	}
}
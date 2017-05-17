import java.util.Scanner;

public class TestTriangle {
	public static void main(String[] args) {
		System.out.print("Enter three sides of Triangle: ");
		Scanner input = new Scanner(System.in);
		double side1 = input.nextDouble();
		double side2 = input.nextDouble();
		double side3 = input.nextDouble();

		Triangle t1 = new Triangle(side1, side2, side3);

		System.out.print("Color ? ");
		String color = input.next();
		t1.setColor(color);

		System.out.print("Filled or not ? ");
		boolean filled = input.nextBoolean();
		t1.setFilled(filled);

		System.out.println("----------");
		System.out.println("\nfilled? " + t1.isFilled());
		System.out.println("\ncolor? " + t1.getColor());
	}
}
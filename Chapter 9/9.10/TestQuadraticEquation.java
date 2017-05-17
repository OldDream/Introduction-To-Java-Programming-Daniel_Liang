import java.util.Scanner;

public class TestQuadraticEquation {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a b c:");

		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();

		QuadraticEquation first = new QuadraticEquation(a, b, c);

		if (first.getDiscriminant() > 0)
			System.out.println("Root1 is " + first.getRoot1() + 
				" Root2 is " + first.getRoot2());
		else if (first.getDiscriminant() == 0)
			System.out.println("Root is " + first.getRoot1());
		else
			System.out.println("The equation has no roots.");
	}
}
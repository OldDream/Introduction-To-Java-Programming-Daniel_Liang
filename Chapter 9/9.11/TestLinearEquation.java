import java.util.Scanner;

public class TestLinearEquation {
	public static void main(String[] args) {
		System.out.print("Enter a b c d e f:");
		Scanner input = new Scanner(System.in);

		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double d = input.nextDouble();
		double e = input.nextDouble();
		double f = input.nextDouble();

		LinearEquation equation1 = new LinearEquation(a,b,c,d,e,f);

		if (equation1.isSolvable())
			System.out.println("X = " + equation1.getX() + " Y = " + equation1.getY());
		else
			System.out.println("The equation has no solution.");
	}
}
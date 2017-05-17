import java.util.Scanner;

public class TestLinearEquation {
	public static void main(String[] args) {
		System.out.print("Enter x1, y1, x2, y2, x3, y3, x4, y4:");
		Scanner input = new Scanner(System.in);

		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double x3 = input.nextDouble();
		double y3 = input.nextDouble();
		double x4 = input.nextDouble();
		double y4 = input.nextDouble();

		CrossoverPoint point1 = new CrossoverPoint(x1, y1, x2, y2, x3, y3, x4, y4);

		double a = point1.getA();
		double b = point1.getB();
		double c = point1.getC();
		double d = point1.getD();
		double e = point1.getE();
		double f = point1.getF();

		LinearEquation equation1 = new LinearEquation(a,b,c,d,e,f);

		if (equation1.isSolvable())
			System.out.println("The intersection point is " + 
				"X = " + equation1.getX() + " Y = " + equation1.getY());
		else
			System.out.println("The two lines are parallel.");
	}
}
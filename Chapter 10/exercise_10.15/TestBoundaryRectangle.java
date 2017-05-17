import java.util.Scanner;

public class TestBoundaryRectangle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[][] points = new double[5][2];
		System.out.print("Enter five points: ");

		for (int i = 0; i < points.length; i++) {
			for (int j = 0; j < 2; j++)
				points[i][j] = input.nextDouble();
		}

		MyRectangle2D bd = BoundaryRectangle.getRectangle(points);
		System.out.println("The bounding rectangle's center is ( " + bd.getX() + "," + bd.getY() + 
			" ) , width " + bd.getWidth() + " height " + bd.getHeight());
	}
}

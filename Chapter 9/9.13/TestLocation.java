import java.util.Scanner;

public class TestLocation {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of row and column in the array:");

		int row = input.nextInt();
		int column = input.nextInt();

		double[][] a = new double[row][column];

		System.out.println("Enter sthe array:");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				a[i][j] = input.nextDouble();
			}
		}

		System.out.println("The location of largest element is " + 
			Location.locateLargest(a).maxValue + " at (" +
			Location.locateLargest(a).row + ", " + 
			Location.locateLargest(a).column + ").");
	}
}

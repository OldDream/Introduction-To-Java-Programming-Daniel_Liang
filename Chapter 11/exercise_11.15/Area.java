import java.util.ArrayList;
import java.util.Scanner;

public class Area {
	public static void main(String[] args) {
		System.out.print("Enter the number of the point:");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		System.out.println("Enter the cordinates of the points:");
		ArrayList<MyPoint> list = new ArrayList<>();
		for (int i = 0; i < num; i++) {
			list.add(new MyPoint(input.nextDouble(), input.nextDouble()));
		}
		System.out.printf("The toyal Area is: %.2f ", Area(list, num));
	}
		

	public static double Area(ArrayList<MyPoint> list, int num) {
		MyPoint a = list.get(0);
		double sum = 0;
		for (int i = 0; i < num - 2; i++) {
			sum += new Triangle(a, list.get(i + 1), list.get(i + 2)).getArea();
		}
		return sum;
	}

}
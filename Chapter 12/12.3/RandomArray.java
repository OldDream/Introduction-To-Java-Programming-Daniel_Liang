import java.util.*;

public class RandomArray {
	public static void main(String[] args) {
		int[] random = new int[100];
		for (int i = 0; i < random.length; i++) {
			random[i] = (int)(Math.random() * 1000);
		}
		Scanner input = new Scanner(System.in);
		try {
			System.out.print("Enter an index:");
			int in = input.nextInt();
			System.out.println(random[in]);
		}
		catch(Exception ex) {
			System.out.println("Out of bounce.");
		}
	}
}
import java.util.*;

public class IntegerSum {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter integer A:");
		int a = 0, b = 0;
		while (true) {
			try {
				a = input.nextInt();
				break;
			}
			catch (InputMismatchException ex){
				System.out.print("Enter a legal integer:");
				input.nextLine();
			}
		}
		System.out.print("Enter integer B:");
		while (true) {
			try {
				b = input.nextInt();
				break;
			}
			catch (InputMismatchException ex){
				System.out.print("Enter a legal integer:");
				input.nextLine();
			}
		}
		System.out.println(a + " + " + b + " = " + (a + b));
	}
}
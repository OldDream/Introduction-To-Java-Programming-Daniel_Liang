import java.util.Scanner;

public class SmallPrimeFactor {
	public static void main(String[] args) {
		System.out.print("Enter a plus integer:");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		StringBuilder stk = new StringBuilder();

		FindPrimeFactor(num, stk);

		System.out.println(stk.toString());		
	}

	public static void FindPrimeFactor(int num, StringBuilder stk) {
		for (int i = num; i >=1; i--) {
			if (isPrime(i)) {
				if (i != 1) {
					stk.insert(0, i + " ");
				}
			}
		}
	public static boolean isPrime(int value) {
		for (int i = 2; i < value; i++) {
			if (value % i == 0)
				return false;
		}
		return true;
	}
}
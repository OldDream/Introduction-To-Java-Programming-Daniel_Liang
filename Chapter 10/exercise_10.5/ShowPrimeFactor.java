import java.util.Scanner;

public class ShowPrimeFactor {
	public static void main(String[] args) {
		System.out.print("Enter a plus integer:");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		StackOfIntegers stk = new StackOfIntegers();
		StackOfIntegers stk1 = new StackOfIntegers();

		FindPrimeFactor(num, stk);

		while(!stk.isEmpty())
			stk1.push(stk.pop());

		while(!stk1.isEmpty())
			System.out.print(stk1.pop() + " ");
		System.out.println();
	}

	public static void FindPrimeFactor(int num, StackOfIntegers stk) {
		for (int i = num; i >=1; i--) {
			if (num % i == 0 && isPrime(i)) {
				if (i != 1) {
					stk.push(i);
					num /= i;
					i = num + 1;
				}
			}
		}
	}

	public static boolean isPrime(int value) {
		if (value == 2)
			return true;
		for (int i = 2; i < value; i++) {
			if (value % i == 0)
				return false;
		}
		return true;
	}
}
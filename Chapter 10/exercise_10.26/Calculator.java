import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a expression:");
		String s = input.nextLine();
		String[] temp = MySplit.split(s, "[+-*/]");
		System.out.println(doCalculate(temp));
	}

	public static double doCalculate(String[] s) {
		double a = Double.parseDouble(s[0]);
		char operator = s[1].charAt(0);
		double b = Double.parseDouble(s[2]);

		switch (operator) {
			case '+' : return a + b;
			case '-' : return a - b;
			case '*' : return a * b;
			case '/' : return a / b;
			default : return 0;
		}
	}
}
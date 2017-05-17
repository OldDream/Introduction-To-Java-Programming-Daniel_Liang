import java.util.Scanner;
import java.util.ArrayList;

public class RepeatAdditionQuiz {
	public static void main(String[] args) {
		int num1 = (int)(Math.random() * 10);
		int num2 = (int)(Math.random() * 10);

		Scanner input = new Scanner(System.in);

		System.out.print("What is " + num1  + " + " + num2 + " is ? ");
		int answer = input.nextInt();

		ArrayList<Integer> list = new ArrayList<>();
		while (num2 + num1 != answer) {
			if (!list.contains(answer)) {
				list.add(answer);
				System.out.print("Wrong! Try again: ");
			}
			else
				System.out.print("You already entered " + answer + "\nTry again: ");
			answer = input.nextInt();
		}
		System.out.println("You got it!");
	}
}
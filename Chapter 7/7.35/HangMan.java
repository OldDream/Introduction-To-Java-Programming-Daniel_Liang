import java.util.Scanner;

public class HangMan {
	public static void main(String[] args) {
		String[] words = {"talk", "laugh", "jiang", "ze", "min"};
		boolean next = true;
		while (next) {
			//get a word.
			String word = words[(int)(Math.random() * words.length)];
			//make a "******"
			StringBuilder cmp = new StringBuilder();
			for (int i = 0; i < word.length(); i++) {
				cmp.append("*");
			}
			//done == true means the word has been finished.
			boolean done = false;
			int miss = 0;
			Scanner input = new Scanner(System.in);
			while (!done) {
				System.out.print("(Guess) Enter a letter in word " + cmp + " : ");
				char in = input.next().charAt(0);
				boolean hit = false;
				if ((cmp.toString()).contains(in + "")) {
					System.out.println(in + " is already in the word.");
					continue;
				}

				for (int i = 0; i < word.length(); i++) {
					if (word.charAt(i) == in) {
						cmp.setCharAt(i, in);
						hit = true;
					}
				}

				if (hit == false) {
					miss++;
					System.out.println(in + " is not in the word.");
				}

				if (!cmp.toString().contains("*"))
					done = true;
			}
			//Guess next?
			System.out.println("The word is " + word + ". You miss " + miss + " times");
			System.out.print("Do you want to guess another word? Enter y / n : ");
			char a = input.next().charAt(0);
			if (a == 'n')
				next = false;
		}
	}
}
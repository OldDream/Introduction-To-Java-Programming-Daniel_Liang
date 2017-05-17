public class Calculator {
	public static void main(String[] args) {
		if (args.length != 3) {
			System.out.println(
				"Usage: java Calculator operand1 operator operand2");
			System.exit(0);
		}

		int result = 0;

		for (int i = 0; i < args[0].length(); i++) {
			if (!Character.isDigit(args[0].charAt(i))) {
				System.out.println("WRONG INPUT " + args[0]);
				System.exit(1);
			}
		}

		for (int i = 0; i < args[2].length(); i++) {
			if (!Character.isDigit(args[2].charAt(i))) {
				System.out.println("WRONG INPUT " + args[2]);
				System.exit(1);
			}
		}

		switch (args[1].charAt(0)) {
			case '+': result = Integer.parseInt(args[0]) + Integer.parseInt(args[2]);	break;
			case '-': result = Integer.parseInt(args[0]) - Integer.parseInt(args[2]);	break;
			case '*': result = Integer.parseInt(args[0]) * Integer.parseInt(args[2]);	break;
			case '/': result = Integer.parseInt(args[0]) / Integer.parseInt(args[2]);	break;
		}

		System.out.println(args[0] + ' ' + args[1] + ' ' + args[2] + " = " + result);
	}

}
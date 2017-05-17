public class Calculator {
	public static void main(String[] args) {
		if (args.length != 1) {
			System.out.println(
				"Usage: java Calculator \"算式\"");
			System.exit(0);
		}

		Rational result = null;
		char operator = ' ';
		if (args[0].contains("+"))
			operator = '+';
		else if (args[0].contains("-"))
			operator = '-';
		else if (args[0].contains("*"))
			operator = '*';
		else if (args[0].contains("/"))
			operator = '/';
		else
			System.exit(0);
		args[0] = args[0].replaceAll(" ", "");	  //去掉空格
		String[] temp = args[0].split("[\\W]");

		switch (operator) {
			case '+': result = new Rational(Integer.parseInt(temp[0]), Integer.parseInt(temp[1]))
						.add(new Rational(Integer.parseInt(temp[2]), Integer.parseInt(temp[3])));	break;
			case '-': result = new Rational(Integer.parseInt(temp[0]), Integer.parseInt(temp[1]))
						.subtract(new Rational(Integer.parseInt(temp[2]), Integer.parseInt(temp[3])));	break;
			case '*': result = new Rational(Integer.parseInt(temp[0]), Integer.parseInt(temp[1]))
						.multiply(new Rational(Integer.parseInt(temp[2]), Integer.parseInt(temp[3])));	break;
			case '/': result = new Rational(Integer.parseInt(temp[0]), Integer.parseInt(temp[1]))
						.divide(new Rational(Integer.parseInt(temp[2]), Integer.parseInt(temp[3])));	break;
		}

		System.out.println(result.toString());
	}

}
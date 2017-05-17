import java.util.Scanner;

public class Testbin2Dec {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("The binary number is: ");
		String binStr = input.next();
		try {
			System.out.println("The dec number is: " + bin2Dec.bin2Dec(binStr));
		}
		catch (BinaryFormatException ex) {
			ex.printStackTrace();
		}
	}
}
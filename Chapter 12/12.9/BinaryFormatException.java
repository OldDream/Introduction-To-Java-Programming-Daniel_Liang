public class BinaryFormatException extends Exception {
	public BinaryFormatException() {
		super("Invalid Hex String.");
	}
	public BinaryFormatException(String a) {
		super(a);
	}
}
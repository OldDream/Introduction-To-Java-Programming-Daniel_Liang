public class HexFormatException extends Exception {
	public HexFormatException() {
		super("Invalid Hex String.");
	}
	public HexFormatException(String a) {
		super(a);
	}
}
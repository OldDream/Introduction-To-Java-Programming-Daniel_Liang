public class bin2Dec {
	public static double bin2Dec(String binaryString)
		throws BinaryFormatException {
		double dec = 0;
		for (int i = binaryString.length() - 1, j = 0; i >=0; i--, j++) {
			if (binaryString.charAt(i) != '1' && binaryString.charAt(i) != '0')
				throw new BinaryFormatException("Invalid binaryString");
			dec += Math.pow(2, j) * Integer.parseInt(String.valueOf(binaryString.charAt(i)));	
		}
		return dec;
	}
}
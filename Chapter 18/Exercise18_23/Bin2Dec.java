public class Bin2Dec {
    public static int bin2Dec(String binaryString) {
        return bin2Dec(binaryString, 0);
    }

    public static int bin2Dec(String binaryString, int num) {
        if (binaryString.length() == 0)
            return num;
        else {
            num += Integer.parseInt(binaryString.substring(0, 1)) * Math.pow(2, binaryString.length() - 1);
            return bin2Dec(binaryString.substring(1, binaryString.length()), num);
        }
    }
}
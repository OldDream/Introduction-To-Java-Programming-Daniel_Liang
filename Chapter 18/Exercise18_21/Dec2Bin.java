public class Dec2Bin {
    private static StringBuilder sb = new StringBuilder();
    public static String dec2Bin(int value) {
        if (value / 2 == 0) {
            int yu = value % 2;
            sb.insert(0, yu + "");
            return sb.toString();
        }
        else {
            int yu = value % 2;
            sb.insert(0, yu + "");
            return dec2Bin(value / 2);
        }

    }
}
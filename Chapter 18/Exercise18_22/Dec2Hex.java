public class Dec2Hex {
    private static StringBuilder sb = new StringBuilder();
    public static String dec2Hex(int i) {
        if (i / 16 == 0) {
            int temp = i % 16;
            sb.insert(0, toHex(temp));
            return sb.toString();
        }
        else {
            int temp = i % 16;
            sb.insert(0, toHex(temp));
            return dec2Hex(i / 16);
        }
    }

    public static String toHex(int i) {
        switch (i) {
            case 10 : return "A";    
            case 11 : return "B";    
            case 12 : return "C";   
            case 13 : return "D";   
            case 14 : return "E";    
            case 15 : return "F";   
            default:    return i + "";    //String.valueOf(i)也行。。
        }
    }
}
public class Hex2Dec {
    public static int hex2Dec(String hexString) {
        return hex2Dec(hexString, 0);
    }

    public static int hex2Dec(String hexString, int num) {
        if (hexString.length() == 0)
            return num;
        else {
            num += toDec(hexString.charAt(0)) * Math.pow(16, hexString.length() - 1);
            return hex2Dec(hexString.substring(1, hexString.length()), num);
        }
    }

    public static int toDec(char i) {
        if (Character.isLetter(i))
            i = Character.toUpperCase(i);
        switch (i) {
            case 'A' : return 10;
            case 'B' : return 11;
            case 'C' : return 12;
            case 'D' : return 13;
            case 'E' : return 14;
            case 'F' : return 15;
            default : return Integer.parseInt(i + "");
        }
    }
}
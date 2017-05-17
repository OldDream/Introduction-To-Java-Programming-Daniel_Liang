public class ReverseDisplay {
    public static void reverseDisplay(String value) {
        int high = value.length() - 1;
        reverseDisplay(value, high);
    }

    public static void reverseDisplay(String value, int high) {
        if (high > 0) {
            System.out.print(value.charAt(high));
            reverseDisplay(value, --high);
        }
        else
            System.out.print(value.charAt(high));
    }
}
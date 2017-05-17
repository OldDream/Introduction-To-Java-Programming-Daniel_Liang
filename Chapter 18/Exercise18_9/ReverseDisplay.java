public class ReverseDisplay {
    public static void reverseDisplay(String value) {
        int index = value.length() - 1;
        reverseDisplay(value, index);
    }

    public static void reverseDisplay(String value, int index) {
        if (index > 0) {
            System.out.print(value.charAt(index));
            reverseDisplay(value, --index);
        }
        else
            System.out.print(value.charAt(index));
    }
}
public class ReverseDisplay {
    public static void reverseDisplay(int value) {
        int index = (String.valueOf(value).length()) - 1;
        reverseDisplay(String.valueOf(value), index);
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
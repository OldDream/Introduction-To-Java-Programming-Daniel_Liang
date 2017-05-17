public class CountUpperCase {
    public static int countUpperCase(String str) {
        return countUpperCase(str, 0, 0);
    }

    public static int countUpperCase(String str, int num, int index) {
        if (index < str.length() &&  Character.isUpperCase(str.charAt(index))) {
            num++;
        }

        if (index == str.length() - 1) {    //base case.
            return num;
        }

        return countUpperCase(str, num, ++index);
    }
}
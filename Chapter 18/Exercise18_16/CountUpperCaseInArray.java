public class CountUpperCaseInArray {
    public static int countUpperCaseInArray(char[] ary) {
        return countUpperCaseInArray(ary, 0, 0);
    }

    public static int countUpperCaseInArray(char[] ary, int num, int index) {
        if (index < ary.length &&  Character.isUpperCase(ary[index])) {
            num++;
        }

        if (index == ary.length - 1) {    //base case.
            return num;
        }

        return countUpperCaseInArray(ary, num, ++index);
    }
}
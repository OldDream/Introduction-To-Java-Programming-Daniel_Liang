public class FindMaxInArray {
    public static int findMaxInArray(int[] ary) {
        return findMaxInArray(ary, 0, ary[0]);
    }

    public static int findMaxInArray(int[] ary, int index, int max) {
        if (max < ary[index]) {
            max = ary[index];
        }

        if (index == ary.length - 1) {    // base case.
            return max;
        }

        return findMaxInArray(ary, ++index, max);    //recursion.

    }
}
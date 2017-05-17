import java.util.Arrays;

public class Exercise19_7 {
    public static void main(String[] args) {
        Integer[] list = {1,2,3,5,123,32,221,333,77};
        System.out.println("The index of 5 is (in a sorted array): " + binarySearch(list, 5));
    }

    public static <E extends Comparable<E>> int binarySearch(E[] list, E key) {
        Arrays.sort(list);
        int high = list.length, low = 0;
        while (high >= low) {
            int mid = (high + low) / 2;
            if (list[mid].compareTo(key) == 0)    //相等时
                return mid;
            else {
                if (list[mid].compareTo(key) > 0)
                    high = mid - 1;
                else
                    low = mid + 1;
            }
        }
        return -1;
    }
}
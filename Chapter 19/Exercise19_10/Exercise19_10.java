import java.util.ArrayList;
import java.util.Arrays;

public class Exercise19_10 {
    public static void main(String[] args) {
        Integer[] list = {1,2,8,5,4,9,7,6,10};
        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(list));
        System.out.println("Max: " + max(al));
    }

    public static <E extends Comparable<E>> E max(ArrayList<E> list) {
        E max = list.get(0);
        for (E a : list) {
            if (a.compareTo(max) > 0)
                max = a;
        }
        return max;
    }
}
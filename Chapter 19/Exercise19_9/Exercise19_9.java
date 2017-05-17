import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;

public class Exercise19_9 {
    public static void main(String[] args) {
        Integer[] list = {1,2,8,5,4,9,7,6,10};
        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(list));
        sort(al);
        System.out.println("Shuffed: " + al);
    }

    public static <E extends Comparable<E>> void sort(ArrayList<E> list) {
        Collections.sort(list);
    }
}
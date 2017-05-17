import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;

public class Exercise19_8 {
    public static void main(String[] args) {
        Integer[] list = {1,2,3,5,6,7,8};
        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(list));
        shuffle(al);
        System.out.println("Shuffed: " + al);
    }

    public static <E> void shuffle(ArrayList<E> list) {
        Collections.shuffle(list);
    }
}
import java.util.ArrayList;
import java.util.Arrays;


public class Exercise19_3 {
    public static void main(String[] args) {
        String[] str = {"aaa", "bbb", "aaa", "ccc", "bbb", "ddd", "aaa"};
        ArrayList<String> al = new ArrayList<>(Arrays.asList(str));
        ArrayList<String> re = removeDuplicatrs(al);
        System.out.println(al);
        System.out.println(re);
    }

    public static <E> ArrayList<E> removeDuplicatrs(ArrayList<E> list) {
        ArrayList<E> list1 = new ArrayList<>();
        for (E a : list)
            list1.add(a);
        ArrayList<E> tempAL = new ArrayList<>();
        while (!list1.isEmpty()) {
            E o = list1.get(0);
            if (tempAL.contains(o))
                continue;
            else {
                tempAL.add(o);
                while (list1.contains(o))
                    list1.remove(o);
            }
        }
        return tempAL;
    }
}
import java.util.*;

public class Review21_6 {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        set1.add("red");
        set1.add("yellow");
        set1.add("green");

        Set<String> set2 = new HashSet<>();
        set2.add("red");
        set2.add("yellow");
        set2.add("blue");

        set1.clear();
        for (String a : set1) {
            System.out.println(a);
        }
        System.out.println();
        for (String a : set2) {
            System.out.println(a);
        }

    }
}
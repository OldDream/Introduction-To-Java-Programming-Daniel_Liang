import java.util.*;

public class Exercise21_1 {
    public static void main(String[] args) {
        String[] s1 = {"George", "Jim", "John", "Blake", "Kevin", "Michael"};
        String[] s2 = {"George", "Katie", "Kevin", "Michelle", "Ryan"};
        LinkedHashSet<String> set1 = new LinkedHashSet<>(Arrays.asList(s1));
        LinkedHashSet<String> set2 = new LinkedHashSet<>(Arrays.asList(s2));

        union(set1, set2);
        intersection(set1, set2);
        difference(set1, set2);
        difference(set2, set1);
    }

    public static void union(LinkedHashSet o1, LinkedHashSet o2) {
        LinkedHashSet<String> set1 = (LinkedHashSet<String>)o1.clone();
        LinkedHashSet<String> set2 = (LinkedHashSet<String>)o2.clone();

        set1.addAll(set2);
        System.out.print("Union: ");
        for (String a : set1) {
            System.out.print(a + "  ");
        }
        System.out.println();
    }

    public static Set intersection(LinkedHashSet o1, LinkedHashSet o2) {
        LinkedHashSet<String> set1 = (LinkedHashSet<String>)o1.clone();
        LinkedHashSet<String> set2 = (LinkedHashSet<String>)o2.clone();

        set1.retainAll(set2);
        System.out.print("Intersection: ");
        for (String a : set1) {
            System.out.print(a + "  ");
        }
        System.out.println();

        return set1;
    }

    public static void difference(LinkedHashSet o1, LinkedHashSet o2) {
        LinkedHashSet<String> set1 = (LinkedHashSet<String>)o1.clone();
        LinkedHashSet<String> set2 = (LinkedHashSet<String>)o2.clone();

        set1.removeAll(intersection(set1, set2));
        System.out.print("Difference: ");
        for (String a : set1) {
            System.out.print(a + "  ");
        }
        System.out.println();
    }
}
import java.util.*;

public class Exercise20_10 {
    public static void main(String[] args) {
        PriorityQueue<String> a = new PriorityQueue<>(Arrays.asList("George", "Jim", "John", "Blake", "Kevin", "Michael"));
        PriorityQueue<String> b = new PriorityQueue<>(Arrays.asList("George", "Katie", "Kevin", "Michelle", "Ryan"));

        PriorityQueue<String> tempA = new PriorityQueue<>(a);
        PriorityQueue<String> tempB = new PriorityQueue<>(b);
        
        //并集
        String s;
        while ((s = tempA.poll()) != null) {
            if (!b.contains(s))
                tempB.add(s);
        }
        System.out.println(tempB);

        //交集
        PriorityQueue<String> overlap = new PriorityQueue<>(a);
        overlap.retainAll(b);
        System.out.println(overlap);

        //差集
        PriorityQueue<String> delta = new PriorityQueue<>(a);
        delta.removeAll(b);
        System.out.println(delta);
    }
}
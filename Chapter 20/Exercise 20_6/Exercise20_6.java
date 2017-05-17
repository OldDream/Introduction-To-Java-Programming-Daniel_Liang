import java.util.*;

public class Exercise20_6 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        System.out.println("Start filling...");
        for (int i = 0; i < 5000000; i++) {
            list.addFirst((int)(Math.random() * 1000));
        }
        System.out.println("Filling finished.\nStart  ergodic...");
        long start = System.currentTimeMillis();
        for (int i = 0; i < 5000000; i++) {
            list.get(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("get(index) takes " + (end - start) + " milliseconds.");

        long start1 = System.currentTimeMillis();
        Iterator<Integer> it = list.listIterator();
        while (it.hasNext())
            it.next();
        long end1 = System.currentTimeMillis();
        System.out.println("Iterator takes " + (end1 - start1) + " milliseconds.");
    }
}
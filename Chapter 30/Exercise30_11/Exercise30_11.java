import java.util.*;
import java.util.concurrent.*;

public class Exercise30_11 {
    private static Set<Integer> set1 = new HashSet<>();
    private static Set<Integer> set2 = new HashSet<>();

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        executor.execute(new Tester1());
        executor.execute(new Tester2());

        executor.shutdown();
    }

    private static class Tester1 implements Runnable {
        @Override
        public void run() {
            synchronized (set1) {
                System.out.println("Thread1 Lock set1.");
                synchronized (set2) {
                    System.out.println("Thread1 Lock set2.");
                }
            }
        }
    }

    private static class Tester2 implements Runnable {
        @Override
        public void run() {
            synchronized (set2) {
                System.out.println("Thread2 Lock set2.");
                synchronized (set1) {
                    System.out.println("Thread2 Lock set2.");
                }
            }
        }
    }


}
import java.util.*;
import java.util.concurrent.*;

public class Exercise30_10 {
    private static Set<Integer> set = Collections.synchronizedSet(new HashSet<>());
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        executor.execute(new SetWriter());
        executor.execute(new SetReader());

        executor.shutdown();
    }

    private static class SetWriter implements Runnable {
        @Override
        public void run() {
            try {
                while (true) {
                    for (int i = 0; ; i++) {
                        set.add(i);
                        Thread.sleep(100);
                    } 
                }
            }
            catch (InterruptedException ex) {
                    ex.printStackTrace();
            }
        }
    }

    private static class SetReader implements Runnable {
        @Override
        public void run() {
            try {
                Thread.sleep(1000);
                while (true) {
                    synchronized (set) {
                        Iterator it = set.iterator();
                        while (it.hasNext()) {
                            System.out.print(it.next() + " ");
                            Thread.sleep(100);
                        }
                    }
                }
            }
            catch (InterruptedException ex) {
                    ex.printStackTrace();
            }
            
        }
    }
}
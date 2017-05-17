import java.util.*;
import java.util.concurrent.*;

public class Exercise30_9 {
    private static Set<Integer> set = new HashSet<>();
    public static void main(String[] args) {
        ExecutorService execotor = Executors.newFixedThreadPool(2);
        execotor.execute(new SetWriter());
        execotor.execute(new SetReader());

        execotor.shutdown();
    }

    private static class SetWriter implements Runnable {
        @Override
        public void run() {
            try {
                while (true) {
                    set.add(ThreadLocalRandom.current().nextInt(100));
                    Thread.sleep(100);   
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
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    System.out.print(it.next() + " ");
                    Thread.sleep(100);
                }
            }
            catch (InterruptedException ex) {
                    ex.printStackTrace();
            }
            
        }
    }
}
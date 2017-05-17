import java.util.concurrent.*;

public class Exercise30_4 {
    private static Integer sum = 0;
    public static void main(String[] args) {
        ExecutorService executor = Executors.newCachedThreadPool();

        for (int i = 0; i < 10000; i++) {
            executor.execute(new AddSum());
        }

        executor.shutdown();

        while(!executor.isTerminated()) {
        }
        
        System.out.println("Sum : " + sum);
    }

    private static class AddSum implements Runnable {
        @Override
        public void run() {
            synchronized(sum) {
                sum += 1;
            }
        }
    }
}
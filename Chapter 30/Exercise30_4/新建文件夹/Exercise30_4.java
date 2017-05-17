import java.util.concurrent.*;

public class Exercise30_4 {
    private static Sum sum = new Sum();
    public static void main(String[] args) {
        ExecutorService executor = Executors.newCachedThreadPool();

        for (int i = 0; i < 10000; i++) {
            executor.execute(new AddSum());
        }

        executor.shutdown();

        while(!executor.isTerminated()) {
        }
        
        System.out.println("Sum : " + sum.num);
    }

    private static class AddSum implements Runnable {
        @Override
        public void run() {
            synchronized(sum) {
                sum.num += 1;
            }
        }
    }

    private static class Sum {
        public static int num = 0;

    }
}
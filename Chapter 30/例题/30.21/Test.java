public class Test implements Runnable {
    public static void main(String[] args) throws InterruptedException {
        new Test();
    }

    public Test() throws InterruptedException {
        Thread thread = new Thread(this);
        thread.sleep(1000);
    }

    public synchronized void run() {

    }
}
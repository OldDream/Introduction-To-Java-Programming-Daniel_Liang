public class TaskThreadDemo {
    public static void main(String[] args) {
        Runnable p1 = new PrintChar('a', 100);
        Runnable p2 = new PrintChar('b', 100);
        Runnable p3 = new PrintNum();

        Thread t1 = new Thread(p1);
        Thread t2 = new Thread(p2);
        Thread t3 = new Thread(p3);

        t1.start();
        t2.start();
        t3.start();

    }
}

class PrintChar implements Runnable {
    private char charToPrint;
    private  int times;

    public PrintChar(char charToPrint, int times) {
        this.charToPrint = charToPrint;
        this.times = times;
    }

    @Override
    public void run() {
        for (int i = 0; i < times; i++) {
            System.out.print(charToPrint);
        }
    }
}

class PrintNum implements Runnable {
    @Override
    public void run() {
        Thread t4 = new Thread(new PrintChar('c', 500));
        t4.start();
        try {
            for (int i = 0; i <= 100; i++) {
                System.out.print(i + " ");
                if (i == 50)
                    t4.join();
            }
        }
        catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}
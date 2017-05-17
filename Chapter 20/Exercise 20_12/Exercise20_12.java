public class Exercise20_12 {
    public static void main(String[] args) throws CloneNotSupportedException {
        MyPriorityQueue<String> a = new MyPriorityQueue<>();
        a.offer("One");
        a.offer("Two");
        a.offer("Three");

        MyPriorityQueue<String> b = a.clone();

        System.out.println(a.peek() == b.peek());

    }
}
public class Exercise13_8 {
    public static void main(String[] args) {
        MyStack ms1 = new MyStack();
        MyStack ms2 = (MyStack)ms1.clone();

        System.out.println(ms1.list == ms2.list);
    }
}
public class Exercise19_2 {
    public static void main(String[] args) {
        GenericStack<String> gs = new GenericStack<>();

        gs.push("11111");
        gs.push("two");
        gs.push("33333");

        System.out.println(gs.toString());
        System.out.println("size " + gs.size());
        System.out.println("peek " + gs.peek());
        System.out.println("pop " + gs.pop());
        System.out.println(gs.toString());

    }
}
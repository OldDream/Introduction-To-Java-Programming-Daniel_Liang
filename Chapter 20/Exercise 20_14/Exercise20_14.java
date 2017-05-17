public class Exercise20_14 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Invalid input!");
            System.exit(1);
        }

        Postfix.postfix(args[0]);
    }
}
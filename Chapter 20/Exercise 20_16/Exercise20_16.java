public class Exercise20_16 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.exit(1);
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < args[0].length(); i++) {    //整理算式格式
            char a = args[0].charAt(i);
            if (a == ' ')
                continue;
            else if ((a + "").matches("[\\w]"))
                sb.append(a);
            else if ((a + "").matches("[+-/()[\\*]]")) {
                sb.append(" ");
                sb.append(a);
                sb.append(" ");
            }
            else {
                System.out.println("Error at :" + a);
                System.exit(0);
            }
        }
        System.out.println("Infix : " + sb.toString());
        System.out.println(InfixToPostFix.infixToPostFix(sb.toString()));
    }
}
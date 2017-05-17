import java.util.*;

public class Postfix {
    public static void postfix(String str) {
        int result = 0;
        Stack<Integer> stk = new Stack<>();
/*        for (String a : str.split(" ")) {
             System.out.println(a);
        } //test*/

        for (String a : str.split(" ")) {
            if (a.matches("[\\d]*")) {
                stk.push(Integer.parseInt(a));
                // System.out.println("push " + a);
            }
            else if (a.length() == 0) {
                continue;
            }
            else if (a.matches("[\\D]")) {
                // System.out.println(stk);
                int b = stk.pop();
                int c = stk.pop();
                switch (a) {
                    case "+" : result = c + b;    stk.push(result);    break;
                    case "-" : result = c - b;    stk.push(result);    break;
                    case "*" : result = c * b;    stk.push(result);    break;
                    case "/" : result = c / b;    stk.push(result);    break;
                    default : System.out.println("Invalid input : " + a);
                              System.exit(1);
                }
            }
        }
        System.out.println("result = " + result);
    }
}
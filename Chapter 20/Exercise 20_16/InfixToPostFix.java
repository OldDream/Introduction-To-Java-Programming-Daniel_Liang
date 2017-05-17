import java.util.Stack;

public class InfixToPostFix {
    public static String infixToPostFix(String str) {
        StringBuilder sb = new StringBuilder();
        Stack<String> stk = new Stack<>();
        for (String a : str.split(" ")) {
            System.out.println("sb : " + sb.toString());
            System.out.println("Stack : " + stk);
            System.out.println("------");
            if (a.matches("[[\\w][\\d]]*"))
                sb.append(a);
            else if (a.matches("[\\(]")) {
                stk.push(a);
            }
            else if (a.matches("[\\)]")) {
                while (!stk.peek().equals("(")) {
                    sb.append(stk.pop());
                }
                if (stk.peek().equals("(")) {
                    stk.pop();
                }
            }
            else if (a.matches("[+-[\\*]/]")) {
                if (stk.empty())
                    stk.push(a);
                else {
                    if (stk.peek().equals("(")) {
                        stk.push(a);
                    }
                    else if (a.matches("[+-]")) {
                        while (!stk.empty()) {
                            if (!stk.peek().equals("("))
                                sb.append(stk.pop());
                            else
                                break;
                        }
                        stk.push(a);
                    }
                    else {
                        while (!stk.empty()) {
                            if (!stk.peek().equals("(") && !stk.peek().equals("+") && !stk.peek().equals("-"))
                                sb.append(stk.pop());
                            else
                                break;
                        }
                        stk.push(a);
                    }
                }
            }    
        }
        while (!stk.empty())
                sb.append(stk.pop());

        return sb.toString();
    }
}
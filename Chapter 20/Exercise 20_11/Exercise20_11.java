import java.util.*;
import java.io.File;

public class Exercise20_11 {
    public static void main(String[] args) {
        if (args.length!= 1) {
            System.out.println("Invalid input.");
            System.exit(1);
        }

        File file = new File(args[0]);
        if (!file.exists()) {
            System.out.println("File not exist.");
            System.exit(1);
        }

        checker(file);
    }

    private static void checker(File file) {
        Character[] temp = {'[', ']', '{', '}', '(', ')'};
        ArrayList<Character> symbols = new ArrayList<>(Arrays.asList(temp));
        Stack<Character> tempStack = new Stack<>();
        try (Scanner input = new Scanner(file)) {
            ArrayList<Character> list = new ArrayList<>();
            String s;
            while (input.hasNextLine()) {    //将整个文件内容全部放到list中。
                s = input.nextLine();
                for (char a : s.toCharArray()) {
                    list.add(a);
                }
            }
            for (char a : list) {
                if (symbols.contains(a)) {
                    if ((symbols.indexOf(a) & 1) == 0 && tempStack.isEmpty()) {
                        tempStack.push(a);
                    }
                    else if ((symbols.indexOf(a) & 1) == 1) {
                        if (symbols.indexOf(a) - 1 != symbols.indexOf(tempStack.peek())) {
                            System.out.println(tempStack.pop() + a + "Wrong!");
                            System.exit(0);
                        }
                        else {
                            tempStack.pop();
                        }
                    }
                    else
                        tempStack.push(a);
                }
            }
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }


}
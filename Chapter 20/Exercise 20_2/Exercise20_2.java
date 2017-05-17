import java.util.*;

public class Exercise20_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();
        while (true) {
            System.out.print(" 1.add \n 2.sort \n 3.reverse \n 4.shuffle \n 5.show \n 6.exit \n : ");
            int i = input.nextInt();
            switch (i) {
                case 1 : add(list);    break;
                case 2 : sort(list);    break;
                case 3 : reverse(list);    break;
                case 4 : shuffle(list);    break;
                case 5 : System.out.println(list);    break;
                case 6 : System.exit(0);
                default : break;
            }
        }
    }

    public static void add(List list) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a integer: ");
        list.add(input.nextInt());
    }

    public static void sort(List list) {
        Collections.sort(list);
    }

    public static void reverse(List list) {
        Collections.sort(list, Collections.reverseOrder());
    }

    public static void shuffle(List list) {
        Collections.shuffle(list);
    }
}
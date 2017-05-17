import java.util.*;

public class Exercise20_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String lottery = (int)(100 + Math.random() * 900) + "";

        System.out.println("Test " + lottery);

        System.out.print("Enter a number (XXX) : ");
        String strIn = input.nextLine();
        cheakNum(strIn, lottery);
    }

    public static void cheakNum(String input, String lottery) {
        if (input.equals(lottery)) {
           System.out.println("Full rank! $10,000.");
           System.exit(0);
        }
        else if (input.length() == lottery.length()) {
            ArrayList<Integer> listInput = new ArrayList<>();
            ArrayList<Integer> listLottery = new ArrayList<>();

            for (int i = 0; i < input.length(); i++) {
                listInput.add(Integer.parseInt(input.charAt(i) + ""));
            }
            System.out.println("input : " + listInput);    //Test

            for (int i = 0; i < lottery.length(); i++) {
                listLottery.add(Integer.parseInt(lottery.charAt(i) + ""));
            }
            System.out.println("lottery : " + listLottery);    //test
            
            int counter = 0;
            for (int i = 0; i < listLottery.size(); i++) {
                if (listLottery.contains(listInput.get(0))) {
                    Integer temp = listInput.get(0);
                    listInput.remove(temp);
                    listLottery.remove(temp);
                    System.out.println("+1s");
                    counter++;
                    i--; 
                }
                else
                    listInput.remove(listInput.get(0));
            }
            if (counter == 3)
                System.out.println("$3,000.");
            else if (counter == 2)
                System.out.println("$2,000.");
            else if (counter == 1)
                System.out.println("$1,000.");
            else
                System.out.println("...");
        }
    }
}
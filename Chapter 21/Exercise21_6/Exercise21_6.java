import java.util.*;
import java.io.*;

public class Exercise21_5 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Invalid input.");
            System.exit(0);
        }

        TreeMap<Integer, Integer> treemap = new TreeMap<>();
        //读取并存储到TreeMap内
        try (Scanner input = new Scanner(new File(args[0]))) {
            int temp = 0;
            while ((temp = input.nextInt()) != 0) {
                if (!treemap.containsKey(temp)) {
                    treemap.put(temp, 1);
                }
                else {
                    int value = treemap.get(temp);
                    value++;
                    treemap.put(temp, value);
                }
            }
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }

        //挑选最高频率的弹出
        TreeSet<Integer> set = new TreeSet<>(treemap.values());
        int high = set.last();

        Set entrySet = treemap.entrySet();
        for (Object a : entrySet) {
            Map.Entry b = (Map.Entry)a;
            if ((Integer)b.getValue() == high) {
                System.out.println((Integer)b.getKey() + "  " + high);
            } 
        }
    }
}
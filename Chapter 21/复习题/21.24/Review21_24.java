import java.util.*;

public class Review21_24 {
    public static void main(String[] args) {
        Set<String> a = Collections.singleton("Hath");
        a.add("Jiang");

        for (String b : a) {
            System.out.println(b);   
        }
    }
}
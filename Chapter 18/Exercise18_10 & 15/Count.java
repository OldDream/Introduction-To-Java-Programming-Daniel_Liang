public class Count {
    public static int count(String str, char a) {
        return count(str, a, 0);
    }
    public static int count(String str, char a, int number) {
        if (str.charAt(0) == a)
            number++;

        if (str.length() == 1)    //base case.
            return number;
        else
            return count(str.substring(1, str.length()), a, number);
        
    }
}
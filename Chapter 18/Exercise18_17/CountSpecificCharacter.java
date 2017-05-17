public class CountSpecificCharacter {
    public static int count(char[] chars, char ch) {
        return count(chars, ch, 0);
    }
    public static int count(char[] chars, char ch, int high) {
        if (chars[high] == ch && chars.length > high + 1)
            return 1 + count(chars, ch, ++high);
        else if (chars.length == high + 1 && chars[high] == ch)    //base case.
            return 1;
        else if (chars.length == high + 1 && chars[high] != ch)    //base case.
            return 0;
        else
            return 0 + count(chars, ch, ++high);    //Recursion
        
    }
}
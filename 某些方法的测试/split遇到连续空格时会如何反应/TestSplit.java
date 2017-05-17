public class TestSplit {
    public static void main(String[] args) {
        String a = "aaa     bbb ccc";
        String[] b = a.split(" ");     //连续的空格会被分割为空字符串
        String d = "";
        System.out.println("|" + d + "|" + d.length());
        for (String c : b)
            System.out.print(c + "+" + c.length() + "|");

    }
}
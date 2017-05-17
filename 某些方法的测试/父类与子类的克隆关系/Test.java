public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Son a = new Son();
        Son b = (Son)a.clone();
        Father c = new Father();
        Father d = (Father)c.clone();
        System.out.println((a == b) + "\n" + (c == d));
    }
}
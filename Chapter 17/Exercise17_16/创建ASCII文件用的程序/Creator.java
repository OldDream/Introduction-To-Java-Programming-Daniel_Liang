import java.io.*;

public class Creator {
    public static void main(String[] args) {
        try (PrintWriter pw = new PrintWriter("out.txt")) {
            pw.print("hath, 666, +1s");
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
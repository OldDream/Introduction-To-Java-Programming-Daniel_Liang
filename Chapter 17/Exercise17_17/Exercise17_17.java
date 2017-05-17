import java.io.*;

public class Exercise17_17 {
    public static void main(String[] args) {
        try (BitOutPutStream bitout = new BitOutPutStream(new File("bitout.dat"))) {
            bitout.writeBit("010000100100001001101");
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
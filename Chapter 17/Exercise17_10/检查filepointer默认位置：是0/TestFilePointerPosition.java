import java.io.*;

public class TestFilePointerPosition {
    public static void main(String[] args) {
        try (RandomAccessFile in = new RandomAccessFile("AddressData.dat", "rw")) {
            System.out.println("Pointer point at : " + in.getFilePointer());
        }
        catch (IOException ex) {

        }
    }
}
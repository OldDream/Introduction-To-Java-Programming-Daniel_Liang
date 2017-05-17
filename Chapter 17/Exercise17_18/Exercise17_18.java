import java.io.*;

public class Exercise17_18 {
    public static void main(String[] args) {
        File file = new File("bitout.dat");
        System.out.print("File: ");
        System.out.println(getBits(file));
        System.out.print("Integer 2 in BIN : ");
        System.out.println(getBits(2));
    }

    public static String getBits(File file) {
        StringBuilder sb = new StringBuilder();

        try (DataInputStream bitin = new DataInputStream(new BufferedInputStream(new FileInputStream(file)))) {
            while (true) {
                int temp = bitin.read();
                if(temp == -1)
                    return sb.toString();
                StringBuilder tempSb = new StringBuilder(Integer.toBinaryString(temp));
                int size = tempSb.length();
                if (size < 8) {
                    for (int i = 0; i < 8 - size; i++)
                        tempSb.insert(0, "0");
                    tempSb.insert(0, " ");
                }
                sb.append(tempSb);
            }
        }
        catch (EOFException ex) {
            System.out.println("EOF");
            return sb.toString();
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
        return sb.toString();
    }

    public static String getBits(int value) {
        StringBuilder tempSb = new StringBuilder(Integer.toBinaryString(value));     //如果int > 255 那么一个字节就放不下了。。。
        int size = tempSb.length();
        if (tempSb.length() > 8) {
            return tempSb.substring(tempSb.length() - 8, tempSb.length());
        }
        else {
            for (int i = 0; i < 8 - size; i++) {
                tempSb.insert(0, "0");
            }
        }
        return tempSb.toString();
    }
}
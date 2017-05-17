import java.io.*;
import java.util.Scanner;

public class Exercise17_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a filename : ");
        String sourceFile = input.nextLine();
        File file = new File(sourceFile);
        String filenameOut = file.getName() + "_Bin.txt";
        System.out.println("File out: " + filenameOut);
        writeBinToFile(getBin(file), filenameOut);
        System.out.print("Read from TXT and Write back ? (Y/N): ");
        String checkCon = input.next();
        if (checkCon.equals("Y"))
            readBinFromFileAndWrite(filenameOut, sourceFile);
        else
            ;
        //
    }

    public static String getBin(File file) {
        StringBuilder sb = new StringBuilder();

        try (DataInputStream binIn = new DataInputStream(new BufferedInputStream(new FileInputStream(file)))) {
            while (true) {
                int temp = binIn.read();
                if(temp == -1) {
                    sb.deleteCharAt(0);
                    return sb.toString();
                }
                StringBuilder tempSb = new StringBuilder(Integer.toBinaryString(temp));
                int length = tempSb.length();
                if (length < 8) {
                    for (int i = 0; i < 8 - length; i++)
                        tempSb.insert(0, "0");
                    tempSb.insert(0, " ");
                }
                else
                    tempSb.insert(0, " ");
                sb.append(tempSb);
            }
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
        return sb.toString();
    }

    public static void writeBinToFile(String str, String name) {
        try (PrintWriter pw = new PrintWriter(name)) {
            pw.print(str);
        }
        catch(IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void readBinFromFileAndWrite(String sourceFile, String targetFile) {
        try (Scanner binIn = new Scanner(new File(sourceFile));
             DataOutputStream binOut = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(targetFile)))) {
            /* 1. 读入字符串并且进行十六转十的处理，保存为int。
               2. 转成十进制后用正常的write()写到文件*/
            while (binIn.hasNext()) {
                int input = Integer.parseInt(binIn.next(), 2);
                binOut.write(input);
            }
            
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
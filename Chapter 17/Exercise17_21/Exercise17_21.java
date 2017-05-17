import java.io.*;
import java.util.Scanner;

public class Exercise17_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a filename : ");
        String sourceFile = input.nextLine();
        File file = new File(sourceFile);
        String filenameOut = file.getName() + "_Hex.txt";
        System.out.println("File out: " + filenameOut);
        writeHexToFile(getHex(file), filenameOut);
        System.out.print("Write back from TXT ? (Y/N): ");
        String checkCon = input.next();
        if (checkCon.equals("Y"))
            readHexFromFileAndWrite(filenameOut, sourceFile);
        else
            ;
        //
    }

    public static String getHex(File file) {
        StringBuilder sb = new StringBuilder();

        try (DataInputStream hexin = new DataInputStream(new BufferedInputStream(new FileInputStream(file)))) {
            while (true) {
                int temp = hexin.read();
                if(temp == -1) {
                    sb.deleteCharAt(0);
                    return sb.toString();
                }
                StringBuilder tempSb = new StringBuilder(Integer.toHexString(temp));
                if (tempSb.length() < 2) {
                   tempSb.insert(0, " 0"); 
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

    public static void writeHexToFile(String str, String name) {
        try (PrintWriter pw = new PrintWriter(name)) {
            pw.print(str);
        }
        catch(IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void readHexFromFileAndWrite(String sourceFile, String targetFile) {
        try (Scanner hexIn = new Scanner(new File(sourceFile));
             DataOutputStream hexOut = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(targetFile)))) {
            /* 1. 读入字符串并且进行十六转十的处理，保存为int。
               2. 转成十进制后用正常的write()写到文件*/
            while (hexIn.hasNext()) {
                int input = Integer.parseInt(hexIn.next(), 16);
                hexOut.write(input);
            }
            
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
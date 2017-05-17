import java.io.*;
import java.util.*;

public class AddressAPP {
    private static long pointer = 0;
    public static void main(String[] args) {
        while (true) {
            System.out.printf("\n1.Add\n2.Show First\n3.Show Next\n4.Show Previous\n5.Show Last\n6.Update\n7.EXIT\n");
            System.out.print("Enter the action number:");
            Scanner input = new Scanner(System.in);
            int actcode = input.nextInt();

            switch(actcode) {
                case 1 : addNew();    break;
                case 2 : showFirst();    break;
                case 3 : getNext();    break;
                case 4 : getPrevious();    break;
                case 5 : showLast();    break;
                case 6 : updateThis();    break;
                case 7 : exit();    break;
            }
        }
    }

    //将对应字符串写入二进制文件
    public static void addNew() {
        char[] name = new char[32];    //ASCII码能表示的的全部用UTF8编码，这样能做到单个字符1字节。
        cleanArray(name);
        char[] street = new char[32];
        cleanArray(street);
        char[] city = new char[20];
        cleanArray(city);
        char[] state = new char[2];    //用UTF8输出，做到2字节。
        cleanArray(state);
        char[] zip = new char[5];
        cleanArray(zip);

        Scanner input = new Scanner(System.in);
        System.out.print("Enter name: ");
        String tempName = input.nextLine();
        fillTheArray(name, tempName, 32);

        System.out.print("Enter Address: ");
        String tmepStreet = input.nextLine();
        fillTheArray(street, tmepStreet, 32);

        System.out.print("Enter City: ");
        String tmepCity = input.nextLine();
        fillTheArray(city, tmepCity, 20);

        System.out.print("Enter State: ");
        String tmepState = input.nextLine();
        fillTheArray(state, tmepState, 2);

        System.out.print("Enter Zip: ");
        String tmepZip = input.nextLine();
        fillTheArray(zip, tmepZip, 5);

        String tempStrName = String.valueOf(name);
        String tempStrStreet = String.valueOf(street);
        String tempStrCity = String.valueOf(city);
        String tmepStrState = String.valueOf(state);
        String tmepStrZip = String.valueOf(zip);

        writeToFile(tempStrName, 32);
        writeToFile(tempStrStreet, 32);
        writeToFile(tempStrCity, 20);
        writeToFile(tmepStrState, 2);
        writeToFile(tmepStrZip, 5);
    }

    public static void writeToFile(String str, int num) {
        try (FileOutputStream output = new FileOutputStream("AddressData.dat", true)) {
            byte b[] = str.getBytes();    //String转换为byte[]
            byte b1[] = new byte[num];
            for (int i = 0; i < num; i++) {
                b1[i] = b[i];
            }

            System.out.println("--- " + str + ";");
            output.write(b1);
        }
        catch (IOException ex) {
            System.out.println("----------- Writing Failed! " + str + " -------------");
        }
    }

    public static byte[] transBytes(String str, int num) {
        byte b[] = str.getBytes();    //String转换为byte[]
        byte b1[] = new byte[num];
        for (int i = 0; i < num; i++) {
            b1[i] = b[i];
        }
        return b1;
    }

    public static void fillTheArray(char[] ary, String str, int num) {
        for (int i = 0; i < num && i < str.length(); i++) {
            ary[i] = str.charAt(i);
        }
    }

    public static void updateThis() {
        try (RandomAccessFile filein = new RandomAccessFile("AddressData.dat", "rw")) {
            filein.seek(pointer - (32 + 32 + 20 + 5 +2));    //定位输入指针到前一个的开始位置。

            char[] name = new char[32];    //ASCII码能表示的的全部用UTF8编码，这样能做到单个字符1字节。
            cleanArray(name);
            char[] street = new char[32];
            cleanArray(street);
            char[] city = new char[20];
            cleanArray(city);
            char[] state = new char[2];    //用UTF8输出，做到2字节。
            cleanArray(state);
            char[] zip = new char[5];
            cleanArray(zip);

            Scanner input = new Scanner(System.in);
            System.out.print("Enter name: ");
            String tempName = input.nextLine();
            fillTheArray(name, tempName, 32);

            System.out.print("Enter Address: ");
            String tmepStreet = input.nextLine();
            fillTheArray(street, tmepStreet, 32);

            System.out.print("Enter City: ");
            String tmepCity = input.nextLine();
            fillTheArray(city, tmepCity, 20);

            System.out.print("Enter State: ");
            String tmepState = input.nextLine();
            fillTheArray(state, tmepState, 2);

            System.out.print("Enter Zip: ");
            String tmepZip = input.nextLine();
            fillTheArray(zip, tmepZip, 5);

            String tempStrName = String.valueOf(name);
            String tempStrStreet = String.valueOf(street);
            String tempStrCity = String.valueOf(city);
            String tmepStrState = String.valueOf(state);
            String tmepStrZip = String.valueOf(zip);

            filein.write(transBytes(tempStrName, 32));
            filein.write(transBytes(tempStrStreet, 32));
            filein.write(transBytes(tempStrCity, 20));
            filein.write(transBytes(tmepStrState, 2));
            filein.write(transBytes(tmepStrZip, 5));

            pointer = filein.getFilePointer();    //更新指针位置
        }
        catch (IOException ex) {
            System.out.println("--- ERROR IN SHOWING FIRST ---");
        }
    }

    public static void showFirst() {
        try (RandomAccessFile filein = new RandomAccessFile("AddressData.dat", "r")) {
            filein.seek(0);

            byte[] name = new byte[32];
            filein.readFully(name);
            System.out.println(new String(name,"UTF-8"));

            byte[] street = new byte[32];
            filein.readFully(street);
            System.out.println(new String(street,"UTF-8"));

            byte[] city = new byte[20];
            filein.readFully(city);
            System.out.println(new String(city,"UTF-8"));

            byte[] state = new byte[2];
            filein.readFully(state);
            System.out.println(new String(state,"UTF-8"));

            byte[] zip = new byte[5];
            filein.readFully(zip);
            System.out.println(new String(zip,"UTF-8"));

            pointer = filein.getFilePointer();    //更新指针位置
        }
        catch (IOException ex) {
            System.out.println("--- ERROR IN SHOWING FIRST ---");
        }
    }

    public static void getNext() {
        try (RandomAccessFile filein = new RandomAccessFile("AddressData.dat", "r")) {
            filein.seek(pointer);

            byte[] name = new byte[32];
            filein.read(name);
            System.out.println(new String(name,"UTF-8"));

            byte[] street = new byte[32];
            filein.read(street);
            System.out.println(new String(street,"UTF-8"));

            byte[] city = new byte[20];
            filein.read(city);
            System.out.println(new String(city,"UTF-8"));

            byte[] state = new byte[2];
            filein.read(state);
            System.out.println(new String(state,"UTF-8"));

            byte[] zip = new byte[5];
            filein.read(zip);
            System.out.println(new String(zip,"UTF-8"));

            pointer = filein.getFilePointer();    //更新指针位置
        }
        catch (IOException ex) {
            System.out.println("--- ERROR IN GETTING NEXT ---");
        }
    }

    public static void getPrevious() {
        try (RandomAccessFile filein = new RandomAccessFile("AddressData.dat", "r")) {
            filein.seek(pointer - 2 * (32 + 32 + 20 + 2 + 5));
            byte[] name = new byte[32];
            filein.read(name);
            System.out.println(new String(name,"UTF-8"));

            byte[] street = new byte[32];
            filein.read(street);
            System.out.println(new String(street,"UTF-8"));

            byte[] city = new byte[20];
            filein.read(city);
            System.out.println(new String(city,"UTF-8"));

            byte[] state = new byte[2];
            filein.read(state);
            System.out.println(new String(state,"UTF-8"));

            byte[] zip = new byte[5];
            filein.read(zip);
            System.out.println(new String(zip,"UTF-8"));

            pointer = filein.getFilePointer();    //更新指针位置
        }
        catch (IOException ex) {
            System.out.println("--- ERROR IN GETTING PREVIOUS ---");
        }
    }


    public static void showLast() {
        try (RandomAccessFile filein = new RandomAccessFile("AddressData.dat", "r")) {
            filein.seek(filein.length() - 32 - 32 - 20 - 2 - 5);
            byte[] name = new byte[32];
            filein.read(name);
            System.out.println(new String(name,"UTF-8"));

            byte[] street = new byte[32];
            filein.read(street);
            System.out.println(new String(street,"UTF-8"));

            byte[] city = new byte[20];
            filein.read(city);
            System.out.println(new String(city,"UTF-8"));

            byte[] state = new byte[2];
            filein.read(state);
            System.out.println(new String(state,"UTF-8"));

            byte[] zip = new byte[5];
            filein.read(zip);
            System.out.println(new String(zip,"UTF-8"));

            pointer = filein.getFilePointer();    //更新指针位置
        }
        catch (IOException ex) {
            System.out.println("--- ERROR IN SHOWING LAST ---");
        }
    }

    

    public static void cleanArray(char[] ch) {
        for (int i = 0; i < ch.length; i++) {
            ch[i] = ' ';
        }
    }

    public static void exit() {
        System.exit(0);
    }
}
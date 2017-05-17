import java.util.*;
import java.io.File;

public class Exercise20_18 {
    public static void main(String[] args) {
        System.out.print("Enter a directory or a file: ");
        Scanner input = new Scanner(System.in);
        String directory = input.nextLine();

        File file = new File(directory);
        long size = 0;
        if (file.isFile())
            size += file.length();
        else {
            size = getDirectorySize(file);
        }

        System.out.println("The size of file is : " + size);
    }

    public static long getDirectorySize(File file) {
        long size = 0;
        Queue<File> queue = new LinkedList<>();
        queue.offer(file);

        while (queue.peek() != null) {
            File temp = queue.poll();
            if (temp.isFile())
                size += temp.length();
            else {
                File[] listFile = temp.listFiles();
                for (File a : listFile)
                    queue.offer(a);
            }
        }

        return size;
    }
}
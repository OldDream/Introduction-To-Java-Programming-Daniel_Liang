import java.io.*;
import java.util.*;

public class Exercise12_26 {
	public static void main(String[] args) {
		System.out.print("Enter the name of new Directory: ");
		Scanner input = new Scanner(System.in);
		File dir = new File(input.next());
		if (dir.mkdirs())
			System.out.print("Directory created successfully.");
		else
			System.out.print("Directory already exists.");
	}
}
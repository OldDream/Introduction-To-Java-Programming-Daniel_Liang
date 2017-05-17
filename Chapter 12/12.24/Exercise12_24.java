import java.io.*;
import java.util.*;

public class Exercise12_24 {
	public static void main(String[] args) {
		File file = new File("Salary.txt");
		try(PrintWriter fileout = new PrintWriter(file)) {
			for (int i = 1; i <= 1000; i++) {
				fileout.print("FirstName" + i + " LastName" + i + " ");
				String level = getLevel();
				Double salary =  getSalary(level);
				String salaryStr = String.format("%.2f", salary);
				fileout.println(level + " " + salaryStr + ";");
			}
		}
		catch (FileNotFoundException ex) {
			ex.printStackTrace();
		}
	}

	public static String getLevel() {
		String[] temp = {"assistant", "associate", "full"};
		return temp[(int)(Math.random() * temp.length)];
	}

	public static Double getSalary(String level) {
		Double salary = 0.0;
		switch(level) {
			case "assistant" : salary = 50000 + Math.random() * (80000 - 50000);    break;
			case "associate" : salary = 60000 + Math.random() * (110000 - 60000);    break;
			case "full" : salary = 75000 + Math.random() * (130000 - 75000);    break;
			default : salary = 0.0;
		}
		return salary;
	}
	
}
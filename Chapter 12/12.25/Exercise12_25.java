import java.io.*;
import java.util.*;

public class Exercise12_25 {
	public static void main(String[] args) {
		try {
			URL salarylist = new URL("http://cs.armstrong.edu/liang/data/Salary.txt");
			Scanner webin = new Scanner(salarylist.openStream());
			double totalSalaryOfassistant = 0, totalSalaryOfassociate = 0,
					totalSalaryOffull = 0;
			int numOfassociate = 0, numOfassistant = 0, numOffull = 0;

			while (webin.hasNext()) {
				webin.next();	//get FirstName
				webin.next();	//get LastName
				String level = webin.next();
				switch (level) {
					case "associate" : numOfassociate++;
									   totalSalaryOfassociate += webin.nextDouble();
									   break;
					case "assistant" : numOfassistant++;
									   totalSalaryOfassistant += webin.nextDouble();
									   break;
					case "full" : numOffull++;
								  totalSalaryOffull += webin.nextDouble();
								  break;
					default : break;
				}
			}
			System.out.printf("The total salary of assistant is %.2f, average salary is %.2f\n", totalSalaryOfassistant, totalSalaryOfassistant / numOfassistant);
			System.out.printf("The total salary of associate is %.2f, average salary is %.2f\n", totalSalaryOfassociate, totalSalaryOfassociate / numOfassociate);
			System.out.printf("The total salary of full is %.2f, average salary is %.2f\n", totalSalaryOffull, totalSalaryOffull / numOffull);
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}
	}
}
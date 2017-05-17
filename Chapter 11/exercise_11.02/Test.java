public class Test {
	public static void main(String[] args) {
		Faculty f1 = new Faculty("Huang", "HQU", "139", "hyn@hqu.edu.cn", "Civil Engineer", "10W+", "198X", "30+years", "Professor");
		//	public Faculty(String Name, String Address, String PhoneNumber, String Email, String Office,
		//			String Salary, String Date, String WorkTime, String Level) {

		System.out.println(f1.toString());
	}
}
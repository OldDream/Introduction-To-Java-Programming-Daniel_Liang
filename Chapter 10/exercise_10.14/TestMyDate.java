public class TestMyDate {
	public static void main(String[] args) {
		MyDate day = new MyDate();
		System.out.println("Year " + day.getYear() + " Month " + day.getMonth() + " Day " + day.getDay());
		MyDate day1 = new MyDate(34355555133101L);
		System.out.println("Year " + day1.getYear() + " Month " + day1.getMonth() + " Day " + day1.getDay());
	}
}
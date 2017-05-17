public class TestTime {
	public static void main(String[] args) {
		Time t1 = new Time();
		Time t2 = new Time(555550000L);

		System.out.printf("T1 is %d hours %d minutes %d seconds.\n", t1.getHour(), t1.getMinute(), t1.getSecond());
		System.out.printf("T2 is %d hours %d minutes %d seconds.\n", t2.getHour(), t2.getMinute(), t2.getSecond());
	}
}
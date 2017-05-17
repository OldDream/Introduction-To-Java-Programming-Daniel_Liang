import java.util.GregorianCalendar;

public class exercise_9_5 {
	public static void main(String[] args) {
		GregorianCalendar date = new GregorianCalendar();
		System.out.println(date.get(GregorianCalendar.YEAR) + " "
			+ date.get(GregorianCalendar.MONTH) + " " + 
			date.get(GregorianCalendar.DAY_OF_MONTH));
	
		date.setTimeInMillis(1234567898765L);
		System.out.println(date.get(GregorianCalendar.YEAR) + " "
			+ date.get(GregorianCalendar.MONTH) + " " + 
			date.get(GregorianCalendar.DAY_OF_MONTH));
	}
}
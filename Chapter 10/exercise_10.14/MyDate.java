import java.util.Date;
import java.util.Calendar;

public class MyDate {
	private int day, month, year;
	
	public MyDate() {
		//Date d1 = new Date();
		Calendar now = Calendar.getInstance();
		//now.setTime(d1);
		year = now.get(Calendar.YEAR);
		month = now.get(Calendar.MONTH);
		day = now.get(Calendar.DAY_OF_MONTH);
	}

	public MyDate(long milliseconds) {
		Calendar now = Calendar.getInstance();
		now.setTimeInMillis(milliseconds);
		year = now.get(Calendar.YEAR);
		month = now.get(Calendar.MONTH);
		day = now.get(Calendar.DAY_OF_MONTH);
	}

	public MyDate(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}

	public int getYear() {
		return year;
	}
	public int getMonth() {
		return month + 1;
	}
	public int getDay() {
		return day;
	}

	public void setDate(long elapsedtime) {
		Calendar now = Calendar.getInstance();
		now.setTimeInMillis(elapsedtime);
		year = now.get(Calendar.YEAR);
		month = now.get(Calendar.MONTH);
		day = now.get(Calendar.DAY_OF_MONTH);
	}
}
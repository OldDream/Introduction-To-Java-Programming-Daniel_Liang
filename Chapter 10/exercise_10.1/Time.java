public class Time {
	private long hour, minute, second;
	
	public Time() {
		long time = System.currentTimeMillis();
		this.second = time / 1000 % 60;
		this.minute = time / 1000 / 60 % 60;
		this.hour = time / 1000 / 60 / 60;
	}

	public Time(long time) {
		this.second = time / 1000 % 60;
		this.minute = time / 1000 / 60 % 60;
		this.hour = time / 1000 / 60 / 60;
	}

	public Time(int hour, int minute, int second) {
		this.hour = hour;
		this.second = second;
		this.minute = minute;
	}

	public long getHour() {
		return hour;
	}
	public long getSecond() {
		return second;
	}
	public long getMinute() {
		return minute;
	}

	public void setTime(long elapesTime) {
		this.second = elapesTime / 1000 % 60;
		this.minute = elapesTime / 1000 / 60 % 60;
		this.hour = elapesTime / 1000 / 60 / 60;
	}
}
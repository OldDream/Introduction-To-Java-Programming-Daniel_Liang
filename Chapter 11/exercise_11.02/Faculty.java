public class Faculty extends Employee {
	private final String WorkTime, Level;

	public Faculty() {
		WorkTime = "";
		Level = "";
	}

	public Faculty(String Name, String Address, String PhoneNumber, String Email, String Office,
					String Salary, String Date, String WorkTime, String Level) {
		super(Name, Address, PhoneNumber, Email, Office, Salary, Date);
		this.WorkTime = WorkTime;
		this.Level = Level;
	}

	public String toString() {
		return "WorkTime: " + WorkTime + "\nLevel: " + Level + super.toString();
	}
}
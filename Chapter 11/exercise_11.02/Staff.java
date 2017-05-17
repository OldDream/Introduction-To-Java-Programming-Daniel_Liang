public class Staff extends Employee {
	private final String JobNumber;

	public Staff() {
		JobNumber = "";
	}

	public Staff(String Name, String Address, String PhoneNumber, String Email, String Office,
					String Salary, String Date, String JobNumber) {
		super(Name, Address, PhoneNumber, Email, Office, Salary, Date);
		this.JobNumber = JobNumber;
	}

	public String toString() {
		return "JobNumber: " + JobNumber + super.toString();
	}
}
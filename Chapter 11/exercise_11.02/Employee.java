public class Employee extends Person {
	private final String Office, Salary, Date;

	public Employee() {
		super();
		Office = "";
		Salary = "";
		Date = "";
	}

	public Employee(String Name, String Address, String PhoneNumber, String Email, String Office, String Salary, String Date) {
		super(Name, Address, PhoneNumber, Email);
		this.Office = Office;
		this.Salary = Salary;
		this.Date = Date;
	}

	public String toString() {
		return "\nOffice: " + Office + "\nSalary: " + Salary + "\nDate: " + Date + super.toString();
	}
}
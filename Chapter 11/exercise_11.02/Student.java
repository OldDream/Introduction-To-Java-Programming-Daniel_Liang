public class Student extends Person {
	private final String Class;

	public Student() {
		super();
		Class = "";
	}

	public Student(String Name, String Class, String Address, String PhoneNumber, String Email) {
		super(Name, Address, PhoneNumber, Email);
		this.Class = Class;
	}

	public String toString() {
		return "Class" + Class + super.toString();
	}
}
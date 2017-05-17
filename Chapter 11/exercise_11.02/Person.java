public class Person {
	private final String Name, Address, PhoneNumber, Email;

	public Person() {
		Name = "";
		Address = "";
		PhoneNumber = "";
		Email = "";
	}

	public Person(String Name, String Address, String PhoneNumber, String Email) {
		this.Name = Name;
		this.Address = Address;
		this.PhoneNumber = PhoneNumber;
		this.Email = Email;
	}

	public String toString() {
		return "\nName: " + Name + "\nAddress: " + Address + "\nPhoneNumber: " + PhoneNumber
		+ "\nEmail: " + Email + ".";
	}
}
import java.util.*;

public class Course {
	private String courseName;
	//private String[] students = new String[100];
	private ArrayList<String> students = new ArrayList<>();
	private int numberOfStudents;

	public Course(String courseName) {		//ok
		this.courseName = courseName;
	}

	public void addStudent(String student) {	//ok
		students.add(student);
		numberOfStudents++;
	}

	public String[] getStudents() {
		StringBuilder studentsMod = new StringBuilder(students.toString());
		String studentsSub = studentsMod.substring(1, studentsMod.length() - 1);
		return studentsSub.split(", ");	//正
	}

	public int getNumberOfStudents() {	//ok
		return numberOfStudents;
	}

	public String getCOursename() {		//ok
		return courseName;
	}

	public void dropStudent(String student) {	//ok
		students.remove(student);
	}

	public void clear() {		//ok
		numberOfStudents = 0;
		students.clear();
	}
}
public class Course {
	private String courseName;
	private String[] students = new String[100];
	private int numberOfStudents;

	public Course(String courseName) {
		this.courseName = courseName;
	}

	public void addStudent(String student) {
		if (1 + numberOfStudents > students.length) {
			String[] temp = new String[students.length * 2];
			System.arraycopy(students, 0, temp, 0, students.length);
			this.students = temp;
		}
		students[numberOfStudents] = student;
		numberOfStudents++;
	}

	public String[] getStudents() {
		return students;
	}

	public int getNumberOfStudents() {
		return numberOfStudents;
	}

	public String getCOursename() {
		return courseName;
	}

	public void dropStudent(String student) {
		int index = 0;
		while (true) {
			if (students[index] == student)
				break;
			else
				index++;
		}
		while (students[index] != null) {
			students[index] = students[index + 1];
			index++;
		}
	}

	public void clear() {
		numberOfStudents = 0;
		for(int i = 0; students[i] != null; i++) {
			students[i] = null;
		}
	}
}
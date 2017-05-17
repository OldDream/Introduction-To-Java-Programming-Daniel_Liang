public class TestCourse {
	public static void main(String[] args) {
		Course math = new Course("math");
		math.addStudent("HuangYN");
		math.addStudent("Zhuang");
		math.addStudent("HuangYH");

		for (String a : math.getStudents())
			if (a != null)
				System.out.println(a);
	}
}
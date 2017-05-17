public class TestCourse {
	public static void main(String[] args) {
		Course math = new Course("math");
		math.addStudent("HuangYN");
		math.addStudent("Zhuang");
		math.addStudent("HuangYH");
		math.dropStudent("HuangYN");

		for (String a : math.getStudents())
			if (a != null)
				System.out.println(a);
	}
}
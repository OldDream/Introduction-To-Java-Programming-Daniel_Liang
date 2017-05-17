import java.util.ArrayList;

public class TestArraylist {
	public static void main(String[] args) {
		ArrayList<Object> list = new ArrayList();
		list.add("Fuck");
		Circle2D c1 = new Circle2D();
		list.add(c1);
		System.out.println(list.toString());
	}
}
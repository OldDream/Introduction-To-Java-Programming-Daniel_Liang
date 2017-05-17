import java.util.*;

public class TestReturnMax {
	public static void main(String[] args) {
		Integer[] array = {1,23,42,3,6,8,22,6,336,90,0};
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
		System.out.println("Max is " + ReturnMax.max(list));
	}
}
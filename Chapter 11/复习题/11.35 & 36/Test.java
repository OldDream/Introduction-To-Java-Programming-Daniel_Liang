import java.util.*;

public class Test {
	public static void main(String[] args) {
		Integer[] array = {2,3,4,1,34,55,3,2,99,0};
		int[] array1 = {2,3,4,1,34,55,3,2,99,0};
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
		Collections.sort(list);
		System.out.println(list);
	}
}
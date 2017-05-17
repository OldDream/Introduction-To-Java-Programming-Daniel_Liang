import java.util.*;

public class Test {
	public static void main(String[] args) {
		Integer[] array = {1,2,3,4,5,6,7,8,9,10};
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
		ShuffleArrayList.shuffle(list);
		System.out.println(list);
	}
}
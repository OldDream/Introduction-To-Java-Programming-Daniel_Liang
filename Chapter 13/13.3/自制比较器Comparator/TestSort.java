import java.util.*;

public class TestSort extends Sort {
	public static void main(String[] args) {
		Integer[] array = {1, 6, 3, 7, 4, 5, 2};
/*		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
		这样并不行，用sort方法的时候会出问题，因为泛型合不上。
*/
		ArrayList<Number> list = new ArrayList<>(Arrays.asList(array));    //只能直接用Number
		sort(list);
		System.out.println(list);
	}

}
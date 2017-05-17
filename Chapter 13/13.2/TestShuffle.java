import java.util.*;

public class TestShuffle extends Shuffle {
	public static void main(String[] args) {
		Integer[] array = {1, 2, 3, 4, 5, 6};
/*		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
		这样并不行，用shuffle方法的时候会出问题，因为泛型合不上。
*/
		ArrayList<Number> list = new ArrayList<>(Arrays.asList(array));    //只能直接用Number
		shuffle(list);
		System.out.println(list);
	}

}
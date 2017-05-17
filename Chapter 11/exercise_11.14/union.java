import java.util.*;

public class union {
	public static void main(String[] args) {
		Integer[] ary1 = {1,2,3};
		Integer[] ary2 = {4,5,6};
		ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(ary1));
		ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(ary2));
		ArrayList<Integer> list3 = union(list1, list2);
		System.out.println(list3);
	}

	public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2) {
		ArrayList<Integer> list3 = new ArrayList<>();
		while (list1.size() != 0) {
			int temp = list1.get(0);
			list3.add(temp);
			list1.remove(0);
		}

		while (list2.size() != 0) {
			int temp = list2.get(0);
			list3.add(temp);
			list2.remove(0);
		}
		return list3;
	}
}
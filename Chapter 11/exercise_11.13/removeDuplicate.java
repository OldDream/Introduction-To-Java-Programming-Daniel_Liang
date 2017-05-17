import java.util.*;

public class removeDuplicate {
	public static void main(String[] args) {
		System.out.print("Enter 10 integers: ");
		Integer[] ary = new Integer[10];
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < 10; i ++) {
			ary[i] = input.nextInt();
		}
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(ary));
		removeDuplicate(list);
		System.out.println(list);
	}

	public static void removeDuplicate(ArrayList<Integer> list) {
		int num = list.size();
		for (int i = 0; i < num; i++) {
			int temp = list.get(i);
			while (list.indexOf(temp) != list.lastIndexOf(temp)) {
				list.remove(temp);
				num--;
			}
		}
	}
}
import java.util.ArrayList;

public class ReturnMax {
	public static Integer max(ArrayList<Integer> list) {
		if (list == null && list.size() == 0)
			return null;
		int tempmax = list.get(0);
		for (Integer a : list) {
			if (a > tempmax)
				tempmax = a;
		}
		return tempmax;
	}
}
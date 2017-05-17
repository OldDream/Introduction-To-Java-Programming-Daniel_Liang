import java.util.*;

public class SortAndSum {
	public static void sort(ArrayList<Integer> list) {
		Collections.sort(list);
	}

	public static double sum(ArrayList<Double> list) {
		double sum = 0;
		for (double a : list)
			sum += a;
		return sum;
	}
}
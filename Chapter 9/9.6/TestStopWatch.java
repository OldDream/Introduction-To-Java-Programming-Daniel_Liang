import java.util.Random;

public class TestStopWatch {
	public static void main(String[] args) {
		StopWatch watch1 = new StopWatch();

		Random random1 = new Random();
		int[] randomlist = new int[1_00000];
		for(int i = 0; i < randomlist.length; i++) {
			randomlist[i] = random1.nextInt();
		}
		watch1.start();
		SelectionSort.SelectionSort(randomlist);
		watch1.stop();

		System.out.println("The sort takes " + watch1.getElapsedTime() + " milliseconds.");

	}
}
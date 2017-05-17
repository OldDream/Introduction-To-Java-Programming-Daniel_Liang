import java.util.Random;

public class exercise_9_4 {
	public static void main(String[] args) {
		Random random1 = new Random(1000);
		int[] randomlist = new int[50];
		for(int i = 0; i < randomlist.length; i++) {
			randomlist[i] = random1.nextInt(51);
			System.out.println(randomlist[i]);
		}
	}
}
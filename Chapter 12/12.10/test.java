public class test {
	public static void main(String[] args) {
		int len = Integer.MAX_VALUE;
		try {
			int largArray[] = new int[len];
		}
		catch (Throwable ex) {
			System.out.println("While building a new array.");
			System.exit(1);
		}
        System.out.print(len);
	}
}
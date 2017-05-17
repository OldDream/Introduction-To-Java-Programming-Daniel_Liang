public class Location {
	public int row, column;
	public double maxValue;

	public static Location locateLargest(double[][] a) {
		Location loc1 = new Location();

		loc1.maxValue = a[0][0];

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (loc1.maxValue < a[i][j]) {
					loc1.row = i;	//保存下标和数值
					loc1.column = j;
					loc1.maxValue = a[i][j];
				}
			}
		}
		return loc1;
	}
}
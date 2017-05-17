public class MyPoint {
	private double x, y;

	public MyPoint() {
		x = 0;
		y = 0;
	}
	public MyPoint(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}

	public double distance(double x1, double y1) {
		return Math.sqrt(Math.pow(x - x1, 2) + Math.pow(y - y1, 2));
	}
	public double distance(MyPoint a) {
		return Math.sqrt(Math.pow(x - a.x, 2) + Math.pow(y - a.y, 2));
	}
}
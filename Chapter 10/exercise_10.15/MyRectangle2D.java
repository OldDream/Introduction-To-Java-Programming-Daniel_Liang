public class MyRectangle2D {
	private double x, y, width, height;

	public MyRectangle2D() {
		x = 0;
		y = 0;
		width = 1;
		height = 1;
	}

	public MyRectangle2D(double x, double y, double height, double width) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	public double getWidth() {
		return width;
	}
	public double getHeight() {
		return height;
	}

	public double getArea() {
		return width * height;
	}

	public double getPerimeter() {
		return 2 * (width + height);
	}

	public boolean contains(double x, double y) {
		if (Math.abs(x - this.x) < width && Math.abs(y - this.y) < height)
			return true;
		else
			return false;
	}

	public boolean contains(MyRectangle2D r) {
		double deltaX = Math.abs(x - r.getX());
		double deltaY = Math.abs(y - r.getY());
		if (deltaX + 0.5 * r.getWidth() < this.width && deltaY + 0.5 * r.getHeight() < this.height)
			return true;
		else 
			return false; 
	}

	public boolean overlaps(MyRectangle2D r) {
		double deltaX = Math.abs(x - r.getX());
		double deltaY = Math.abs(y - r.getY());
		if (deltaX + 0.5 * r.getWidth() >= this.width && deltaY + 0.5 * r.getHeight() >= this.height
			&& deltaX <= 0.5 * (r.getWidth() + this.width) && deltaY <= 0.5 * (r.getHeight() + this.height))
			return true;
		else 
			return false; 
	}

}
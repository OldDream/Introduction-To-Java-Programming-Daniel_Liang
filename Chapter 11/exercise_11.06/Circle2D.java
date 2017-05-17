public class Circle2D {
	private double x, y;
	private double radius;

	public Circle2D() {
		x = 0;
		y = 0;
		radius = 1;
	}

	public Circle2D(double x, double y, double radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	public String toString() {
		return "Circle x: " + x + " y = " + y + " radius = " + radius;
	}

	public double getArea() {
		return Math.PI * Math.pow(radius, 2);
	}

	public double getPerimeter() {
		return Math.PI * radius * 2;
	}

	public boolean contains(int x, int y) {
		if (Math.sqrt(Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2)) < radius)
			return true;
		else
			return false;
	}

	public boolean contains(Circle2D circle) {
		if (Math.sqrt(Math.pow(x - circle.x, 2) + Math.pow(y - circle.y, 2)) < this.radius - circle.radius)
			return true;
		else
			return false;		
	}

	public boolean overlaps(Circle2D circle) {
		double delta = Math.sqrt(Math.pow(x - circle.x, 2) + Math.pow(y - circle.y, 2));
		if (delta < circle.radius + this.radius && delta > this.radius - circle.radius)
			return true;
		else
			return false;
	}
}
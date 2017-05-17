public class Triangle {
	private double x1 , y1, x2, y2, x3, y3, length1, length2, length3;

	public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
		this.x1 = x1;	this.x2 = x2;	this.x3 = x3;
		this.y1 = y1;	this.y2 = y2;	this.y3 = y3;
	}
	
	public Triangle(MyPoint a, MyPoint b, MyPoint c) {
		this.x1 = a.getX();	this.x2 = b.getX();	this.x3 = c.getX();
		this.y1 = a.getY();	this.y2 = b.getY();	this.y3 = c.getY();
	}

	public double getArea() {
		this.length1 = Math.pow(Math.pow(x1 - x2 , 2) + Math.pow(y1 - y2 , 2) , 0.5);
		this.length2 = Math.pow(Math.pow(x2 - x3 , 2) + Math.pow(y2 - y3 , 2) , 0.5);
		this.length3 = Math.pow(Math.pow(x3 - x1 , 2) + Math.pow(y3 - y1 , 2) , 0.5);
		double s = (length3 + length2 + length1) / 2;
		double square = Math.pow(s * (s - length1) * (s - length2) * (s - length3) , 0.5);

		return square;
	}

	public double getPerimeter() {
		this.length1 = Math.pow(Math.pow(x1 - x2 , 2) + Math.pow(y1 - y2 , 2) , 0.5);
		this.length2 = Math.pow(Math.pow(x2 - x3 , 2) + Math.pow(y2 - y3 , 2) , 0.5);
		this.length3 = Math.pow(Math.pow(x3 - x1 , 2) + Math.pow(y3 - y1 , 2) , 0.5);
		return length3 + length2 + length1;
	}
}
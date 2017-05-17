public class Triangle2D {
	private MyPoint a, b, c;

	public Triangle2D() {
		a = new MyPoint(0, 0);
		b = new MyPoint(1, 1);
		c = new MyPoint(2, 5);
	}

	public Triangle2D(MyPoint a, MyPoint b, MyPoint c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public MyPoint getA() {
		return a;
	}
	public MyPoint getB() {
		return b;
	}
	public MyPoint getC() {
		return c;
	}

	public void setA(MyPoint a) {
		this.a = a;
	}
	public void setB(MyPoint b) {
		this.b = b;
	}
	public void setC(MyPoint c) {
		this.c = c;
	}

	public double getArea() {
		return new Triangle(a, b, c).getArea();
	}

	public double getPerimeter() {
		return new Triangle(a, b, c).getPerimeter();
	}

	public boolean contains(MyPoint p) {
		if (new CorssPoint(p,a,b,c).checkCross())
			return false;
		else if (new CorssPoint(p,b,a,c).checkCross())
			return false;
		else if (new CorssPoint(p,c,a,b).checkCross())
			return false;
		else
			return true;
	}

	public boolean contains(Triangle2D t) {
		if (this.contains(t.getA()) && this.contains(t.getB()) && this.contains(t.getC()))
			return true;
		else
			return false;
	}

	public boolean overlaps(Triangle2D t) {
		int count = 0;
		if (this.contains(t.getA()))
			count++;
		if (this.contains(t.getB()))
			count++;
		if (this.contains(t.getC()))
			count++;

		if (count == 1 || count == 2)
			return true;
		else
			return  false;
	}
}
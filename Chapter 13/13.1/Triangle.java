public class Triangle extends GeometricObject {
	private double side1 = 1, side2 = 1, side3 = 1;

	public Triangle() {
	}

	public Triangle(double side1, double side2, double side3) 
		throws IllegalTriangleException {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
		double max1 = Math.max(side1, side2);
		double max2 = Math.max(max1, side3);
		if (max2 > side2 + side1 + side3 - max2)
			throw new IllegalTriangleException();
	}

	public double getSide1() {
		return side1;
	}

	public double getSide2() {
		return side2;
	}

	public double getSide3() {
		return side3;
	}

	public double getArea() {
		double length1 = side1;
		double length2 = side2;
		double length3 = side3;
		double s = (length3 + length2 + length1) / 2;
		double square = Math.pow(s * (s - length1) * (s - length2) * (s - length3) , 0.5);
		return square;
	}

	public double getPerimeter() {
		return side3 + side2 + side1;
	}

	@Override
	public String toString() {
		return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
	}
}
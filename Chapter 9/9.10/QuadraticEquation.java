public class QuadraticEquation {
	private double a, b, c;

	public QuadraticEquation(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public double getA() {
		return a;
	}
	public double getB() {
		return b;
	}
	public double getC() {
		return c;
	}

	public double getDiscriminant() {
		if(Math.abs(Math.pow(b, 2) - 4 * b *c )- 0 > 0.0001)
			return Math.pow(b, 2) - 4 * b *c;
		else
			return 0;
	}

	public double getRoot1() {
		if (this.getDiscriminant() >= 0)
			return (-b + Math.sqrt(this.getDiscriminant())) / (2 * a);
		else
			return 0;
	}
	public double getRoot2() {
		if (this.getDiscriminant() >= 0)
			return (-b - Math.sqrt(this.getDiscriminant())) / (2 * a);
		else
			return 0;
	}
}
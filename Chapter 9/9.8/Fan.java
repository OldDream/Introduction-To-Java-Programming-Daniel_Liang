public class Fan {
	final static int SLOW = 1, MEDIUM = 2, FAST = 3;
	private int speed = SLOW;
	private boolean on = false;
	private double radius = 5;
	private String color = "blue";

	public void setSpeed(int speed) {
		if(speed <= 3)
			this.speed = speed;
		else
			System.out.printf("Illegal speed.");
	}
	public void setOn(boolean on) {
		this.on = on;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public void setColor(String color) {
		this.color = color;
	}

	public int getSpeed() {
		return speed;
	}
	public String getSpeedWords() {
		switch(speed) {
			case(0) : return "SLOW";
			case(1) : return "MEDIUM";
			case(2) : return "FAST";
			default : return "????";
		}
	}
	public boolean getOn() {
		return on;
	}
	public double getRadius() {
		return radius;
	}
	public String getColor() {
		return color;
	}

	public Fan() {

	}

	public String toString() {
		if (on)
			return ("Speed is " + speed + " color is " + color + 
				" radius is " + radius + ".");
		else
			return("Fan is off" + " color is " + color + 
				" radius is " + radius + ".");
	}
}
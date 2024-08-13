package Day07.Ex01_Shape;

public class Circle extends Shape {

	double radius;
			
	
	public Circle() {
	}

	public Circle(double raidus) {
		this.radius = raidus;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	double area() {
		return Math.PI * Math.pow(radius, 2);
	}

	@Override
	double round() {
		return 2 * Math.PI * radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}

}

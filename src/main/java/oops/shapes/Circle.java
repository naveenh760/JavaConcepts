package oops.shapes;

public class Circle implements Shape{

	private double radius	;
		
	public double getRadius() {
		return radius;
	}


	public void setRadius(double radius) {
		this.radius = radius;
	}


	public Circle(double radius) {
		super();
		this.radius = radius;
	}

     @Override
	public double area() {
		return 3.14* radius * radius;
	}
}

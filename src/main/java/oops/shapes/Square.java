package oops.shapes;

public class Square implements Shape {

	private double side;
	
	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	
	public Square(double side) {
		super();
		this.side = side;
	}

	@Override
	public double area() {
		return side*side;
	}

}

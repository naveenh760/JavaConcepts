package oops.points;

public class Point implements Comparable<Point>{

	//Encapsulation
	protected int x;
	protected int y;
	
	
	public Point() {
		this(0,0);
		System.out.println("Point default Constr");
	}

    public Point(int x, int y) {
    	this.x = x;
    	this.y = y;
    }
	public int getX() {
		return x;
	}


	public void setX(int x) {
		this.x = x;
	}


	public int getY() {
		return y;
	}


	public void setY(int y) {
		this.y = y;
	}

	public boolean is3D() {
		if(this instanceof Point3D) {
			return true;
		}
		else return false;
	}
	
	@Override
	public String toString() {
		return "x= " + x + ", y= " + y ;
	}

	@Override
	public int compareTo(Point o) {
		return this.x - o.x;
	}
	
	
}

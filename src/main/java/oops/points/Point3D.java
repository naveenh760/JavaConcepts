package oops.points;

public class Point3D extends Point {

	protected int z;
	
	public int getZ() {
		return z;
	}


	public void setZ(int z) {
		this.z = z;
	}

	public Point3D() {
		System.out.println("Point3D default Constr");
		this.z = 0;
	}

	public Point3D(int x, int y, int z) {
		super(x, y);
        this.z = z;
	}
	
	@Override
	public String toString() {
		return super.toString()+ " z= " + z ;
	}

}

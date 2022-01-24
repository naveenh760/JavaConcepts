package main;

import oops.points.Point;
import oops.points.Point3D;
import oops.shapes.Circle;
import oops.shapes.Shape;
import oops.shapes.Square;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	Collection.testArray();
	//	testPoint();
	//	String s = "";
//		System.out.println(s.isEmpty());
		testShape();

	}
	
	public static void testPoint() {
		
		Point p1 = new Point3D();
		System.out.println(p1);
		Boolean b = p1.is3D();
		System.out.println(b);
		Point3D p2 = (Point3D)p1;
		System.out.println(p2.getZ());
		
	}
	
	public static void testShape() {
		
		Shape s1 = new Square(3);
		Shape s2 = new Circle(3);
		System.out.println(s1.area());
		System.out.println(s2.area());
		
	}

	
}

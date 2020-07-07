package collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import oops.Point;
import oops.Point3D;

public class ComparatorEx {

	public static void main(String[] args) {
		comparableEx();
		collectionEx();
	}
	
	public static void arrayComparator() {
		Point [] arr = {new Point(10, 20), new Point(3, 12), new Point(5, 7)};
        Arrays.sort(arr, new MySort());
        for(Point point: arr) {
        	System.out.println(point);
        }

	}
	
	public static void arrayComparator1() {
		Point3D [] arr = {new Point3D(10, 20,15), new Point3D(3, 12,17), new Point3D(5, 7,4)};
		Arrays.sort(arr, new MySort());
		for(Point3D point: arr) {
        	System.out.println(point);
        }
	}
	
	public static void collectionEx() {
		Point [] arr = {new Point(10, 20), new Point(3, 12), new Point(5, 7)};
		List<Point> list = Arrays.asList(arr);
		Collections.sort(list, new MySort());
		for(Point point: list) {
        	System.out.println(point);
        }
	}
	
	
	public static void comparableEx() {
		Point [] arr = {new Point(10, 20), new Point(3, 12), new Point(5, 7)};
		List<Point> list = Arrays.asList(arr);
		Collections.sort(list);  //Point class provides natural ordering by implementing comparable.
		for(Point point: list) {
        	System.out.println(point);
        }
	}

}



class MySort implements Comparator<Point> {
	// Used for sorting in ascending order of x.
	public int compare(Point a, Point b) {
		return a.getY() - b.getY();
	}
}

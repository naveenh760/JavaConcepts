package test;
import oops.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class PointTest {

	@Test
	public void testPoint() {
		Point p = new Point();
		assertEquals(p.getX(), 0);
		assertEquals(p.getY(), 0);
	}

	@Test
	public void testPointIntInt() {
		Point p = new Point(1,2);
		assertEquals(p.getX(), 1);
		assertEquals(p.getY(),2);
	}

	@Test
	public void testIs3D() {
		Point p1 = new Point3D();
		assertTrue(p1.is3D());
		Point p2 = new Point();
		assertFalse(p2.is3D());
	}

}

package test;
import oops.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class Point3DTest {

	@Test
	public void testPoint3DIntIntInt() {
		Point3D p1 = new Point3D(1,2,3);
		int[] expected = new int[] {1,2,3};
		int[] actual = new int[] {p1.getX(),p1.getY(),p1.getZ()};
		assertArrayEquals(expected, actual);
	}

}

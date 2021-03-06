package jpkg.arraygenerics;

import static org.junit.Assert.*;
import static jpkg.arraygenerics.ArrayGenerics.isArray;
import static jpkg.arraygenerics.ArrayGenerics.genericToString;
import jpkg.test.TestManager;

import org.junit.Test;

public class ArrayGenericsTest {
	public static void main(String[] args) {
		test();
		TestManager.runTests();
	}
	
	public static void test() {
		TestManager.addTest(ArrayGenericsTest.class);
	}
	
	@Test
	public void testIsArray() {
		assertFalse(isArray(null));
		assertFalse(isArray(1));
		assertFalse(isArray("test"));
		assertTrue(isArray(new int[] {}));
		assertTrue(isArray(new int[][] {}));
		assertTrue(isArray(new Object[][] {}));
		assertTrue(isArray(new String[] {}));
		assertTrue(isArray(new Object[] {null, null}));
	}
	
	@Test
	public void testToString() {
		assertEquals("null", genericToString(null));
		Object o = new Object();
		assertEquals(o.toString(), genericToString(o));
		assertEquals("[[1, 2], [3, 4]]", genericToString(new int[][] {{1, 2}, {3, 4}}));
	}
}

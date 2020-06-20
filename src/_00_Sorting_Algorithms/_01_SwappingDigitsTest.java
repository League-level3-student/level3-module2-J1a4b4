package _00_Sorting_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class _01_SwappingDigitsTest {

	@Test
	public void test() {
		int[] x = {5, 6};
		int[] y = {6, 5};
		_01_SwappingDigits.swapArrayOfTwo(x);
		assertArrayEquals(y, x);
		
		int[] z = {7, 3, 5, 9, 2};
		int[] q = {2, 3, 5, 7, 9};
		_01_SwappingDigits.sortIntArray(z);
		assertArrayEquals(q, z);
		
		int[] m = {7, 3, 9, 5, 2};
		assertEquals(5, _01_SwappingDigits.findMiddle(m));
	}
}
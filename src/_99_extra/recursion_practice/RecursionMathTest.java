package _99_extra.recursion_practice;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RecursionMathTest {

	@Test
	public void testMultiplication() {
		assertEquals(12, RecursionMath.recursiveMultiplication(3, 4));
		//1  Add more JUnit tests like the one above to test your method
		assertEquals(23, RecursionMath.recursiveMultiplication(23, 1));
		assertEquals(13, RecursionMath.recursiveMultiplication(1, 13));
	}
	
	
	@Test
	public void testDivision() {
		//5  Add JUnit tests to test your method
		assertEquals(23, RecursionMath.recursiveDivision(23, 1));
		assertEquals(0, RecursionMath.recursiveDivision(34, 0));
		assertEquals(3, RecursionMath.recursiveDivision(12, 4));
	}
	
	
	@Test 
	public void testPower() {
		//7  Add JUnit tests to test your method
		assertEquals(16, RecursionMath.recursivePower(2, 4));
		assertEquals(1, RecursionMath.recursivePower(1, 1));
		assertEquals(1, RecursionMath.recursivePower(234, 0));
	}
}

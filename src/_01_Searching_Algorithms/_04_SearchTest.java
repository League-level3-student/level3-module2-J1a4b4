package _01_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _04_SearchTest {

	// A MINIMUM OF 3 TESTS ARE REQUIRED FOR EACH METHOD
	
	@Test
	public void testLinearSearch() {
		//1. use the assertEquals method to test your linear search method.
		String[] a = {"I", "am", "the", "very", "model", "of", "a", "modern", "Major", "General."};
		String[] b = {"We", "shall", "never", "surrender!"};
		String[] c = {"Fascinating."};
		assertEquals(_00_LinearSearch.linearSearch(a, "model"), 4);
		assertEquals(_00_LinearSearch.linearSearch(b, "surrender!"), 3);
		assertEquals(_00_LinearSearch.linearSearch(c, "Interesting."), -1);
		
	}

	@Test
	public void testBinarySearch() {
		//2. use the assertEquals method to test your binary search method.
		//   remember that the array must be sorted
		int[] i = {1, 3, 5, 7, 9};
		int[] ii = {2, 5, 8, 10, 828};
		int[] iii = {0, 3, 5, 283, 292, 858, 910};
		assertEquals(_01_BinarySearch.binarySearch(i, 0, 4, 3), 1);
		assertEquals(_01_BinarySearch.binarySearch(ii, 0, 4, 828), 4);
		assertEquals(_01_BinarySearch.binarySearch(iii, 0, 7, 1), -1);
	}
	
	@Test
	public void testInterpolationSearch() {
		//3. use the assertEquals method to test your interpolation search method.
		//   remember that the array must be sorted and evenly distributed
		int[] x = {1, 3, 5, 7, 9};
		int[] y = {2, 5, 8, 11, 14};
		int[] z = {0, 3, 6, 9, 12};
		assertEquals(_02_InterpolationSearch.interpolationSearch(x, 3), 1);
		assertEquals(_02_InterpolationSearch.interpolationSearch(y, 14), 4);
		assertEquals(_02_InterpolationSearch.interpolationSearch(z, 1), -1);
	}
	
	@Test
	public void testExponentialSearch() {
		//4. use the assertEquals method to test your exponential search method.
		//   remember that the array must be sorted
		int[] l = {1, 2, 3, 4, 5, 6};
		int[] m = {0, 2, 5, 7, 8};
		int[] n = {1, 2, 3, 4, 5};
		assertEquals(_03_ExponentialSearch.exponentialSearch(l, 3), 2);
		assertEquals(_03_ExponentialSearch.exponentialSearch(m, 8), 4);
		assertEquals(_03_ExponentialSearch.exponentialSearch(n, 6), -1);
	}
}

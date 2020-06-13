package _00_Sorting_Algorithms;

public class _00_SortedArrayChecker {
	//1. Write a static method called intArraySorted. 
	//   This method takes in an array of integers
	//   and it returns a boolean.
	//   The method returns true if the integer
	//   array is in ascending order and false otherwise
	static boolean intArraySorted (int[] numbers) {
		boolean consistency = false;
		for (int i = 0; i < numbers.length - 1; i++) {
			if (numbers[i] < numbers[i + 1]) {
				consistency = true;
			}else {
				consistency = false;
			}
		}
		if (consistency == true) {
			return true;
		}
		return false;
	}
	//2. Write a static method called doubleArraySorted. 
	//   This method takes in an array of doubles
	//   and it returns a boolean.
	//   The method returns true if the double
	//   array is in ascending order and false otherwise
	static boolean doubleArraySorted(double[] doubles) {
		boolean consistency = false;
		for (int i = 0; i < doubles.length - 1; i++) {
			if (doubles[i] < doubles[i + 1]) {
				consistency = true;
			}else {
				consistency = false;
			}
		}
		if (consistency == true) {
			return true;
		}
		return false;
	}
	//3. Write a static method called charArraySorted. 
	//   This method takes in an array of characters
	//   and it returns a boolean.
	//   The method returns true if the character
	//   array is in alphabetical order and false otherwise
	//   (You can compare characters just like integers)
	static boolean charArraySorted(char[] characters) {
		boolean consistency = false;
		for (int i = 0; i < characters.length - 1; i++) {
			if (characters[i] < characters[i + 1]) {
				consistency = true;
			}else {
				consistency = false;
			}
		}
		if (consistency == true) {
			return true;
		}
		return false;
	}
	//4. Write a static method called stringArraySorted. 
	//   This method takes in an array of Strings
	//   and it returns a boolean.
	//   The method returns true if the String
	//   array is in alphabetical order and false otherwise
	//   (Use the compareTo(String) method)
	static boolean stringArraySorted(String[] strings) {
		boolean consistency = false;
		for (int i = 0; i < strings.length - 1; i++) {
			if (strings[i].compareTo(strings[i + 1]) < 0) {
				consistency = true;
			}else {
				return false;
			}
		}
		if (consistency == true) {
			return true;
		}
		return false;
	}
}
package _00_Sorting_Algorithms;

class _01_SwappingDigits {
	
	//1. Complete the method so that the first two elements of the array are swapped
	public static void swapArrayOfTwo(int[] arr) {
		int placeHolder = arr[1];
		arr[1] = arr[0];
		arr[0] = placeHolder;
	}
	
	//2. Complete the method so that it sorts the array using a bubble sort.
	//   Iterate through the array and when you find two elements that are out
	//   of order, swap them. Repeat this until the array is in order.
	public static void sortIntArray(int[] arr) {
		for (int j = 0; j < arr.length; j++) {
			for (int i = j + 1; i < arr.length; i++) {
				if (arr[j] > arr[i]) {
					int placeHolder = arr[i];
					arr[i] = arr[j];
					arr[j] = placeHolder;
				}
			}
		}
	}
	
	//3. Complete the method so that it finds the middle number in the array.
	//   *Hint* it helps to sort it first.
	//   *Double Hint* Use the method you already wrote in step 2 to sort it
	public static int findMiddle(int[] arr) {
		sortIntArray(arr);
		if (arr.length % 2 == 0) {
			return arr[arr.length / 2];
		}else {
			return arr[(arr.length - 1)/ 2];
		}
	}
}

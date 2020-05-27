package array;

public class MinMaxInSortedRotatedArray {

	public static void main(String[] args) {

/*		int arr1[] = { 5, 6, 1, 2, 3, 4 };
		int n1 = arr1.length;
		System.out.println("The minimum element is " + findMinimum(arr1, 0, n1 - 1));

		int arr2[] = { 1, 2, 3, 4 };
		int n2 = arr2.length;
		System.out.println("The minimum element is " + findMinimum(arr2, 0, n2 - 1));

		int arr3[] = { 1 };
		int n3 = arr3.length;
		System.out.println("The minimum element is " + findMinimum(arr3, 0, n3 - 1));

		int arr4[] = { 1, 2 };
		int n4 = arr4.length;
		System.out.println("The minimum element is " + findMinimum(arr4, 0, n4-1));

		int arr5[] = { 2, 1 };
		int n5 = arr5.length;
		System.out.println("The minimum element is " + findMinimum(arr5, 0, n5-1));

		int arr6[] = { 5, 6, 7, 1, 2, 3, 4 };
		int n6 = arr6.length;
		System.out.println("The minimum element is " + findMinimum(arr6, 0, n6 - 1));

		int arr7[] = { 1, 2, 3, 4, 5, 6, 7 };
		int n7 = arr7.length;
		System.out.println("The minimum element is " + findMinimum(arr7, 0, n7 - 1));

		int arr8[] = { 2, 3, 4, 5, 6, 7, 8, 1 };
		int n8 = arr8.length;
		System.out.println("The minimum element is " + findMinimum(arr8, 0, n8 - 1));

		int arr9[] = { 3, 4, 5, 1, 2 };
		int n9 = arr9.length;
		System.out.println("The minimum element is " + findMinimum(arr9, 0, n9 - 1));*/
		
		
		
		int arr1[] = { 5, 6, 1, 2, 3, 4 };
		int n1 = arr1.length;
		System.out.println("The minimum element is " + findMaximum(arr1, 0, n1 - 1));

		int arr2[] = { 1, 2, 3, 4 };
		int n2 = arr2.length;
		System.out.println("The minimum element is " + findMaximum(arr2, 0, n2 - 1));

		int arr3[] = { 1 };
		int n3 = arr3.length;
		System.out.println("The minimum element is " + findMaximum(arr3, 0, n3 - 1));

		int arr4[] = { 1, 2 };
		int n4 = arr4.length;
		System.out.println("The minimum element is " + findMaximum(arr4, 0, n4-1));

		int arr5[] = { 2, 1 };
		int n5 = arr5.length;
		System.out.println("The minimum element is " + findMaximum(arr5, 0, n5-1));

		int arr6[] = { 5, 6, 7, 1, 2, 3, 4 };
		int n6 = arr6.length;
		System.out.println("The minimum element is " + findMaximum(arr6, 0, n6 - 1));

		int arr7[] = { 1, 2, 3, 4, 5, 6, 7 };
		int n7 = arr7.length;
		System.out.println("The minimum element is " + findMaximum(arr7, 0, n7 - 1));

		int arr8[] = { 2, 3, 4, 5, 6, 7, 8, 1 };
		int n8 = arr8.length;
		System.out.println("The minimum element is " + findMaximum(arr8, 0, n8 - 1));

		int arr9[] = { 3, 4, 5, 1, 2 };
		int n9 = arr9.length;
		System.out.println("The minimum element is " + findMaximum(arr9, 0, n9 - 1));
	}

	static int findMinimum(int[] array, int start, int end) {

		if (start > end)
			return array[0];

		if (start == end)
			return array[start];

		int mid = (start + end) / 2;


		if (start < mid && array[mid] < array[mid - 1] ) {
			return array[mid];
		}

		if (end > mid && array[mid] > array[mid + 1] ) {
			return array[mid + 1];
		}
		

		if (array[mid] < array[end])
			return findMinimum(array, start, mid - 1);
		return findMinimum(array, mid + 1, end);

	}
	

	static int findMaximum(int[] array, int start, int end) {

		// This condition is for the case when 
	    // array is not rotated at all 
		if (start > end)
			return array[0];

		// If there is only one element left 
		if (start == end)
			return array[end];

		int mid = (start + end) / 2;

		 // Check if element at (mid - 1) is maximum element 
	    // Consider the cases like {4, 5, 1, 2, 3} 
		if (start < mid && array[mid] < array[mid - 1] ) {
			return array[mid-1];
		}

		//if Mid
		if (end > mid && array[mid] > array[mid + 1] ) {
			return array[mid];
		}
		
		 // Decide whether we need to go to 
	    // the left half or the right half 
		if (array[mid] > array[end])
			return findMinimum(array, start, mid - 1);
		return findMinimum(array, mid + 1, end);

	}


}

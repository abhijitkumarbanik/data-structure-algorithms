package array;

public class BinarySearch {

	public static void main(String[] args) {

		int[] intArray = { -29, -9, 1, 10, 51, 101, 506, 62 };

		System.out.println(iterativeBinarySearch(intArray, -29));
		System.out.println(iterativeBinarySearch(intArray, -9));
		System.out.println(iterativeBinarySearch(intArray, -62));
		System.out.println(iterativeBinarySearch(intArray, 101));

		/*
		 * System.out.println(recursiveBinarySearch(intArray, -29));
		 * System.out.println(recursiveBinarySearch(intArray, -9));
		 * System.out.println(recursiveBinarySearch(intArray, -62));
		 * System.out.println(recursiveBinarySearch(intArray, 101));
		 */

	}

	public static int iterativeBinarySearch(int[] intArray, int intVal) {
		int start = 0;
		int end = intArray.length;

		while (start < end) {
			int midpoint = (start + end) / 2;
			if (intArray[midpoint] == intVal)
				return midpoint;
			else if (intArray[midpoint] < intVal) {
				start = midpoint + 1;
			} else {
				end = midpoint;
			}
		}
		return -1;
	}

	public static int recursiveBinarySearch(int[] intArray, int intVal) {

		return recursiveBinarySearch(intArray, 0, intArray.length, intVal);
	}

	public static int recursiveBinarySearch(int[] intArray, int start, int end, int intVal) {
		if (start >= end)
			return -1;
		int midpoint = (start + end) / 2;
		if (intArray[midpoint] == intVal)
			return midpoint;
		else if (intArray[midpoint] < intVal)
			return recursiveBinarySearch(intArray, midpoint + 1, end, intVal);
		else
			return recursiveBinarySearch(intArray, start, midpoint, intVal);

	}

}

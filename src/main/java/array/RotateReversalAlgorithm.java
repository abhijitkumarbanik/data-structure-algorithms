package array;

public class RotateReversalAlgorithm {

	public static void main(String[] args) {

		int[] intArray = { 1, 2, 3, 4, 5, 6, 7 };
		int d = 2;

		rotateLeft(intArray, d);
		printArray(intArray);

	}

	private static void printArray(int[] intArray) {

		for (int i : intArray) {
			System.out.print(i + " , ");
		}
	}

	public static void rotateLeft(int[] intArray, int d) {
		reverseArray(intArray, 0, d-1);
		reverseArray(intArray, d, intArray.length-1);
		reverseArray(intArray, 0, intArray.length-1);
	}

	public static void reverseArray(int[] intArray, int start, int end) {
		while (start < end) {
			int temp = intArray[start];
			intArray[start] = intArray[end];
			intArray[end] = temp;

			start++;
			end--;
		}

	}

}

package sorting;

public class QuickSort {

	public static void main(String[] args) {

		int[] intArray = { 25, -9, 55, 35, 17, -15, 1 };

		quickSort(intArray, 0, intArray.length);

		for (int i : intArray) {
			System.out.print(i + " ,");
		}

	}

	public static void quickSort(int[] input, int start, int end) {
		if (end - start < 2)
			return;
		int pivotIndex = partition(input, start, end);

		quickSort(input, start, pivotIndex);
		quickSort(input, pivotIndex + 1, end);

	}

	private static int partition(int[] input, int start, int end) {
		int pivot = input[start];
		int i = start;
		int j = end;

		while (i < j) {
			do {
				i++;
			} while (input[i] <= pivot);
			do {
				j--;
			} while (input[j] > pivot);

			if (i < j) {
				swap(input, i, j);
			}
		}
		swap(input, start, j);
		return j;
	}

	static void swap(int[] intArray, int oldPos, int newPos) {
		if (oldPos == newPos)
			return;

		int temp = intArray[oldPos];
		intArray[oldPos] = intArray[newPos];
		intArray[newPos] = temp;
	}
}

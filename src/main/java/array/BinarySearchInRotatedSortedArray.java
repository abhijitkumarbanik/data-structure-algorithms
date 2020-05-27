package array;

public class BinarySearchInRotatedSortedArray {

	public static void main(String[] args) {

		int arr[] = {4, 5, 6, 7, 8, 9, 1, 2, 3}; 
        int n = arr.length; 
        int i = search(arr, 0, n-1, 3); 
        if (i != -1)  
            System.out.println("Index: " + i); 
        else
            System.out.println("Key not found"); 
	}

	public static int search(int[] intArray, int start, int end, int intVal) {
		if (start > end)
			return -1;
		int mid = (start + end) / 2;
		if (intArray[mid] == intVal)
			return mid;
		else if (intArray[start] <= intArray[mid]) {
			if ((intVal >= intArray[start]) && (intVal <= intArray[mid])) {
				return search(intArray, start, mid-1, intVal);
			}

			return search(intArray, mid + 1, end, intVal);
		} else {
			if ((intVal >= intArray[mid]) && (intVal <= intArray[end]))
				return search(intArray, mid + 1, end, intVal);
			return search(intArray, mid-1, end, intVal);
		}

	}

}

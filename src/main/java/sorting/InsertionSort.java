package sorting;

public class InsertionSort {

	public static void main(String[] args) {

		int[] intArray = { 25, -9, 55, 35, 17, -15 };

		int smallestElement = 0; /* To hold the value of the current index */ 

		for (int unsortedIndex = 1; unsortedIndex < intArray.length; unsortedIndex++) { /*Looping from left to right*/ 
			smallestElement = intArray[unsortedIndex];

			int i;
			for (i = unsortedIndex; i > 0 && intArray[i - 1] > smallestElement; i--) /*Looping from right to left within the unsorted partition */ 
			{
				intArray[i] = intArray[i - 1];
			}
			intArray[i] = smallestElement; /*Setting back the value to the next position*/
		}

		for (int i : intArray) {
			System.out.print(i + " ,");
		}

	}

}

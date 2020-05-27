package sorting;

public class MergeSort {

	public static void main(String[] args) {
		
		int[] intArray = { 25, -9, 55, 35, 17, -15, 1 };
		
		mergeSort(intArray, 0, intArray.length);
		
		for (int i : intArray) {
			System.out.print(i + " ,");
		}
		
	}
	
	public static void mergeSort(int[] input, int start, int end) {
		/*System.out.println("Start : "+start + " End : "+end);*/
		if (end - start < 2)
			return;
		
		int midPoint = (start+end)/2;
		
		mergeSort(input, start, midPoint);
		mergeSort(input, midPoint, end);
		
		merge(input, start, midPoint, end);
		
	}
	
	public static void merge(int[] input, int start, int midPoint, int end)
	{
		if (input[midPoint-1] <= input[midPoint])
			return;

		int i = start;
		int j = midPoint;
		int tempIndex = 0;
		
		int[] tempArray = new int[end-start];
		
		while(i < midPoint && j < end )
		{
			tempArray[tempIndex++] = (input[i] <= input[j]) ? input[i++] : input[j++];
		}
	
		System.arraycopy(input, i, input, start+tempIndex, midPoint-i); /*This copies the left over element from the left side which is not iterated*/
		System.arraycopy(tempArray, 0, input, start, tempIndex); /*This copies back the tempArray to the input Array */
	}

}

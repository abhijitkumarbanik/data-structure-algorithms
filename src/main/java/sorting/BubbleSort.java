package sorting;

public class BubbleSort {

	public static void main(String[] args) {
		
		int[] intArray = {25, -9, 55, 35, 17, -15};
		
		for (int unsortedIndex = intArray.length-1 ; unsortedIndex > 0; unsortedIndex--) 
		{
			for (int i = 0; i < unsortedIndex; i++ )
			{
				if(intArray [i] > intArray [i+1]) {
					swap(intArray, i, i+1);
				}
			}
		}
		
		for (int i : intArray) {
			System.out.print(i +" ,");
		}

	}
	
	static void swap(int[] intArray, int oldPos, int newPos)
	{
		if (oldPos == newPos)
			return;
		
		int temp = intArray[oldPos];
		intArray[oldPos] = intArray[newPos];
		intArray[newPos] =  temp;
	}

}

package sorting;

public class SelectionSort {
	
	public static void main(String[] args) {
		
		int[] intArray = {25, -9, 55, 35, 17, -15};
		
		int largest = 0; 
		
		for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0 ; lastUnsortedIndex -- )
		{
			
			for (int i = 0; i < lastUnsortedIndex; i++)
			{
				if (intArray[i] > intArray[i+1])
				{
					largest = i;
				}
			}
			
			swap(intArray, largest, lastUnsortedIndex);
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

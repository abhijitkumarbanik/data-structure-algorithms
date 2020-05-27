package search;

public class BinarySearch {

	public static void main(String[] args) {
		
		int[] intArray = {-22, -9, 1, 17, 35, 55};
		
		System.out.println(iterativeBinarySearch(intArray, 55) );
		System.out.println(iterativeBinarySearch(intArray, 4354) );
		System.out.println(iterativeBinarySearch(intArray, 1) );
		System.out.println(iterativeBinarySearch(intArray, -22) );
		System.out.println(iterativeBinarySearch(intArray, -9) );
		/*
		System.out.println(recurrsiveBinarySearch(intArray, 55) );
		System.out.println(recurrsiveBinarySearch(intArray, 4354) );
		System.out.println(recurrsiveBinarySearch(intArray, 1) );
		System.out.println(recurrsiveBinarySearch(intArray, -22) );
		System.out.println(recurrsiveBinarySearch(intArray, -9) );
	*/}
	
	public static int iterativeBinarySearch(int[] intArray, int value)
	{
		int start = 0;
		int end = intArray.length;
		
		while (start < end)
		{
			int midPoint = (start + end)/2;
			if (intArray[midPoint] == value )
			{
				return midPoint;
			}
			else if (intArray[midPoint] < value)
			{
				start = midPoint +1;
			}
			else
			{
				end = midPoint;
			}
		}
		return -1;
	}
	
	public static int recurrsiveBinarySearch(int[] intArray, int value)
	{
		return recurrsiveBinarySearch(intArray, 0, intArray.length, value);
	}
	
	public static int recurrsiveBinarySearch(int[] intArray, int start, int end, int value)
	{
		if (start >= end )
			return -1;
		
		int midPoint = (start + end)/2;
		
		if (intArray[midPoint] == value)
		{
			return midPoint;
		}
		else if (intArray[midPoint] < value)
		{
			return recurrsiveBinarySearch(intArray, midPoint+1, end, value);
		}
		else
			return recurrsiveBinarySearch(intArray, start, midPoint, value);
		
	}
}

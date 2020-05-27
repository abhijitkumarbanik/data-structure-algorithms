package search;

public class LinearSearch {

	public static void main(String[] args) {
		
		int[] intArray = {25, -9, 55, 35, 17, -15};
		System.out.println("Index : "+linearSearch(intArray, 3232));

	}
	
	public static int linearSearch(int[] intArray, int value)
	{
		for (int i = 0; i < intArray.length; i++) {
			if (intArray[i] == value)
				return i;
		}
		return -1;
	}

}

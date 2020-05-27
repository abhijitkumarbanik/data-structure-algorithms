package array;

public class RotateArray {

	public static void main(String[] args) {

		int[] intArray = { 1, 2, 3, 4, 5, 6, 7 };
		int d = 2;

		int [] tempArray = new int [intArray.length];
		
		System.arraycopy(intArray, d, tempArray, 0, intArray.length-d);
		for (int i : tempArray) {
			System.out.print(i + " , ");
		}
		
		System.out.println();
		System.arraycopy(intArray, 0, tempArray, intArray.length - d , d);
		
		for (int i : tempArray) {
			System.out.print(i + " , ");
		}
		
	}

}

package array;

import java.util.Arrays;

public class RotateArrayMethod2 {

	public static void main(String[] args) {

		int[] intArray = { 1, 2, 3, 4, 5, 6, 7 };
		int d = 2;


		for (int i : intArray) {
			System.out.print(i + " , ");
		}
		System.out.println();
		for (int i = 0; i < d; i++) {
			intArray = rotateLeft(intArray);
		}

		//Arrays.asList(intArray).stream().forEach(System.out :: println);;
		
		for (int i : intArray) {
			System.out.print(i + " , ");
		}
	}

	public static int[] rotateLeft(int[] intArray) {
		int temp = intArray[0];
		for (int i = 0; i < intArray.length-1; i++) {
			intArray[i] = intArray[i + 1];
		}
		intArray[intArray.length - 1] = temp;
		
		return intArray;
	}

}

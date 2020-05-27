package queue;

import java.util.NoSuchElementException;

public class ArrayQueue {
	
	int[] intArray;
	int start;
	int end;
	
	public ArrayQueue(int intialCapacity) {
		intArray = new int[intialCapacity];
	}
	
	public void add(int value)
	{
		if (intArray.length == end)
		{
			int[] tempArray = new int [2*intArray.length];
			System.arraycopy(intArray, 0, tempArray, 0, intArray.length);
			intArray = tempArray;
		}
		
		intArray[end++] = value;
	}		
		
	public int pop()
	{
		if(isEmpty())
			throw new NoSuchElementException();
		int value = intArray[start];
		intArray[start] = 0;
		start++;
		
		if(isEmpty())
		{
			start =0;
			end =0;
		}
		return value;
	}
	
	public int peek()
	{
		if(isEmpty())
			throw new NoSuchElementException();
		return intArray[start];
	}
	
	public boolean isEmpty()
	{
		if (end-start==0)
			return true;
		return false;
	}
	
	public void printQueue()
	{
		for (int i = start ; i < end; i++)
		{
			System.out.print(intArray[i]+", ");
		}
		System.out.println();
	}

}

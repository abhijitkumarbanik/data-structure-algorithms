package stack;

public class StackArray {
	
	int top;
	int[] intArray;
	
	public StackArray(int intialCapacity) {
		intArray = new int[intialCapacity];
	}
	
	public void push(int value)
	{
		if (top == intArray.length)
		{
			int[] newArray = new int [2 * intArray.length];
			System.arraycopy(intArray, 0, newArray, 0, intArray.length);
			intArray = newArray;
		}
		intArray[top++] = value;
	}
	
	public int pop() throws Exception
	{
		if(isEmpty())
			throw new Exception("No more elements in stack");
		return intArray[--top];
	}
	
	public int peek() throws Exception
	{		
		if(isEmpty())
			throw new Exception("No more elements in stack");
	return intArray[top-1];
	}
	
	public boolean isEmpty()
	{
		if (top == 0)
			return true;
		return false;
	}
	
	public void printStack(){
		for (int i = top-1; i >= 0; i--) {
			System.out.println(intArray[i]);
		}
	}
	

}

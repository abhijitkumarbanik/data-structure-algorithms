package stack;

import java.util.LinkedList;

public class CheckPalindromeString {

	public static void main(String[] args) {
		
		System.out.println(checkPalindrome("Race car"));
		
		System.out.println(checkPalindrome("Did I, I did ?"));

	}
	
	public static boolean checkPalindrome(String str)
	{
		StringBuilder builder = new StringBuilder(str.length());
		LinkedList<Character> stack = new LinkedList<>();
		for(int i = 0 ; i< str.length(); i++)
		{
			if (str.toLowerCase().charAt(i) >= 'a' && str.toLowerCase().charAt(i) <='z')
			{
				builder.append(str.toLowerCase().charAt(i));
				stack.push(str.toLowerCase().charAt(i));
			}
		}
		
		//System.out.println(builder.toString());
		
		StringBuilder reverseStr = new StringBuilder(builder.length());
		//System.out.println("Size of stack : "+stack.size());
		
		/*while(!stack.isEmpty()) {
			reverseStr.append(stack.pop());
		}*/
		
		for (int i = stack.size(); i>0 ;i--)
		{
			reverseStr.append(stack.pop());
		}
		
		//System.out.println(reverseStr.toString());
		
		return builder.toString().equals(reverseStr.toString());
		
	}

}

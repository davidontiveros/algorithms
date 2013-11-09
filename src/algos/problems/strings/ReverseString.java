/**
 * 
 */
package algos.problems.strings;

import algos.algorithms.BaseOperations;

/**
 * 1.2 Write code to reverse a C-Style String. 
 * (C-String means that “abcd” is represented as five characters, including the null character.)
 * 
 * @author daviD_dev
 *
 */
public class ReverseString 
{
	
	public static void main(String[] args) 
	{
		//char str[] = {'a','b','c','d'};
		char str[] = {'a','b','e','x','c','d'};
		new ReverseString().reverseString(str);
		System.out.println(str);
	}
	
	/**
	 * Complexity O(log n) or O (n/2)
	 * @param s
	 */
	private void reverseString(char[] s)
	{
		for(int i=0, j = s.length-1; i < s.length/2; i++, j--)
			BaseOperations.swap(s, i, j);			
	}

}

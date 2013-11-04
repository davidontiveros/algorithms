/**
 * 
 */
package algos.problems.strings;

import algos.algorithms.BaseOperations;

/**
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
		
		//if its pair
		/*
		if(s.length%2==0)
		{
						
		}
		else
		{
			for(int i=0, j = s.length-1; i < s.length/2; i++, j--)
				
		}
		*/
	}

}

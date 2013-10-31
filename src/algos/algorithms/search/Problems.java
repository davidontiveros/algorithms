/**
 * 
 */
package algos.algorithms.search;

/**
 * @author daviD_dev
 *
 */
public class Problems 
{

	/**
	 * @param args
	 */
	static int moves = 0;
	public static void main(String[] args) 
	{
		int array[] = {15,16,19,20,25,1,3,4,5,7,10,14};
		//int array[] = {15,16};
		int element = 14;
		int index = new Problems().findElement(array, element);
		System.out.println(index);
		System.out.println("moves: "+moves);
	}
	
	/**
	 * 	9.3
	 * 	Given a sorted array of n integers that has been rotated an unknown number of times, 
	 * 	give an O(log n) algorithm that finds an element in the array. 
	 * 	You may assume that the array was originally sorted in increasing order.
	 *	EXAMPLE:
	 *	Input: find 5 in array (15 16 19 20 25 1 3 4 5 7 10 14)
	 *	Output: 8 (the index of 5 in the array)
	 */
	public int findElement(int array[], int element)
	{		
		int n = array.length;
		if(n == 1)
			return array[0];
						
		int middle = (n-1)/2;			
		
		//best cases!
		if(element == array[middle])
			return array[middle];
		if(n==2)
			return array[n-1];
		
		//search on RIGHT block : for(int i = middle+1; i <= n; i++)
		int start =  middle+1;
		int end = n;
		
		// search on LEFT block : for(int i = 0; i < middle; i++) 
		if(element>=array[0] && array[middle]<element)
		{
			start = 0;
			end = middle;
		}						
				
		while(start<end)
		{
			if(array[start]==element)
				return start;
			start++;
			moves++;
		}		
		return -1; //not found
	}
		
	

}

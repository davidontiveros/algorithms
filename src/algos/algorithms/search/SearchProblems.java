/**
 * 
 */
package algos.algorithms.search;

/**
 * @author daviD_dev
 *
 */
public class SearchProblems 
{

	/**
	 * @param args
	 */
	static int moves = 0;
	public static void main(String[] args) 
	{
		/* TEST findElement()*/
		/*
		int array[] = {15,16,19,20,25,1,3,4,5,7,10,14};
		//int array[] = {15,16};
		int element = 14;
		int index = new Problems().findElement(array, element);
		System.out.println(index);
		System.out.println("moves: "+moves);
		*/
		
		/* TEST findElementInMatrix() */
		int a[] = {1,2,3,4,5,6};
		int b[] = {7,8,9,10,11,12};
		int c[] = {13,14,15,16,17,18};
		int d[] = {19,20,21,22,23,24};
		int e[] = {25,26,27,28,29,30};
		int array[][] = {a,b,c,d,e};
		int element = 19;
		
		System.out.println(new SearchProblems().findElementInMatrix(array, element));
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
		
	/**
	 * 9.6
	 * Given a matrix in which each row and each column is sorted, 
	 * write a method to find an element in it.
	 * 
	 * complexity O(log(M+N))
	 */
	public String findElementInMatrix(int array[][], int element)
	{
		int i = 0;
		int j = array.length-1;
		
		while( i<array.length && j>=0)
		{
			if(array[j][i] == element)
			{
				return "["+i+"]["+j+"]";
			}
			else if(element < array[j][i])
			{
				moves++;
				j--;
			}
			else 
			{
				moves++;
				i++;
			}
		}
		return "not found";
	}

}

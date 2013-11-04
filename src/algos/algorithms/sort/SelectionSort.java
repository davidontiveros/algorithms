/**
 * 
 */
package algos.algorithms.sort;

import algos.algorithms.BaseOperations;
import algos.problems.XOROperations;

/**
 * Find the smallest element using a linear scan and move it to the front. 
 * Then, find the second smallest and move it, again doing a linear scan. 
 * Continue doing this until all the elements are in place. O(n^2).
 * 
 * @author daviD_dev
 *
 */
public class SelectionSort 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		int input[] = {64,25,12,22,11};		
		new SelectionSort().sort(input);
		BaseOperations.printArray(input);
	}
	
	/**
	 * Complexity = O(n^2)
	 * 
	 * @param input
	 */
	public void sort(int input[])
	{
		int minPos;
		
		for(int i = 0; i < input.length-1; i++)
		{
			//lets say the minPos is actual position
			minPos = i;			
			// compare the min position vs the rest of the elements, to find the new min		
			for(int j = i+1; j < input.length; j++)			
				if(input[j] < input[minPos])
					minPos = j;
			
			// if the min position change since last iteration, swap the element
			if(minPos != i)
				XOROperations.swap(input, minPos, i);
		}
	}

}

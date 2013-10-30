/**
 * 
 */
package algos.algorithms.sort;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import algos.algorithms.BaseOperations;

/**
 * 
 * Bucket sort, or bin sort, is a sorting algorithm that works by partitioning an 
 * array into a number of buckets. 
 * Each bucket is then sorted individually, either using a different sorting algorithm, 
 * or by recursively applying the bucket sorting algorithm.
 * 
 * This gives a time of O(n + m), where n is the number of items and m is the number of distinct items.
 * 
 * @author daviD_dev
 *
 */
public class BucketSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		int input[] = {21, 24, 22, 59, 54, 52, 0, 7, 2, 30, 36, 35, 73, 71, 70, 65, 68, 99};
		new BucketSort().sort(input);
	}
	
	public void sort(int input[])
	{
		// lets say we know the maximum value we can get, and is 100
		// so we will store in buckets of 10.
		int n = 10;
		Map<Integer, ArrayList<Integer>> buckets = new HashMap<Integer, ArrayList<Integer>>(); 
		
		// store each element in correct bucket
		for(int i = 0; i < input.length; i++)
		{
			Integer c = input[i]/10;			
			if(buckets.containsKey(c))
				buckets.get(c).add(input[i]);
			else			
			{
				buckets.put(c, new ArrayList<Integer>());
				buckets.get(c).add(input[i]);
			}
											
		}
		
		// sort each bucket and merge into a final sorted array
		List<Integer> sortedElements = new ArrayList<Integer>();
		for(int i = 0; i <= n; i++)
		{
			if(buckets.containsKey(i))
			{
				Integer array[] = new Integer[buckets.get(i).size()];
				array = buckets.get(i).toArray(array);
				BaseOperations.printArray(new QuickSort().sort(array));
			}
			
		}
	}

}

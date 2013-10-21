package algos.algorithms.search;

/*
	The maximum subarray problem is the task of finding the contiguous subarray within a one-dimensional 
	array of numbers (containing at least one positive number) which has the largest sum. 
	For example, for the sequence of values −2, 1, −3, 4, −1, 2, 1, −5, 4; 
	the contiguous subarray with the largest sum is 4, −1, 2, 1, with sum 6.
	 
	Kadane's algorithm consists of a scan through the array values, computing at each position 
	the maximum subarray ending at that position. This subarray is either empty 
	(in which case its sum is zero) or consists of one more element than 
	the maximum subarray ending at the previous position.
*/
public class KadanesAlgorithm
{
	public static void main(String args[])
	{
		int array[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4, -4,6,7,8,-15,-10,9,10,3,5,-3};
		int r = find(array);
		System.out.println(r);
	}
	
	public static int find(int array[])
	{
		int max_sum = array[0];
		int current_sum = array[0];
		int begin = 0;
		int end = 0;
		
		for(int i=0; i<array.length;i++)
		{
			// calculate
			if(current_sum < 0)
			{
				current_sum = array[i];			
				begin = i;
			}				
			else
				current_sum += array[i];			
			
			// calculate max_sum
			if(current_sum >= max_sum)
			{
				max_sum = current_sum;
				end = i;
			}				
		}		
		System.out.println("from "+begin+"-"+end+" , ["+array[begin]+","+array[end]+"]");
		return max_sum;
	}
	
	public static int find(int array[], int a)
	{
		int max_sum = array[0];
		int current_sum = array[0];
		int begin = 0;
		int end = 0;
		
		for(int i=0; i<array.length;i++)
		{
			// calculate
			if(current_sum < 0)
			{
				current_sum = array[i];			
				begin = i;
			}				
			else
				current_sum += array[i];			
			
			// calculate max_sum
			if(current_sum >= max_sum && (i-begin)>10)
			{
				max_sum = current_sum;
				end = i;
			}				
		}		
		System.out.println("from "+begin+"-"+end+" , ["+array[begin]+","+array[end]+"]");
		return max_sum;
	}
}
package algos.problems;

import algos.algorithms.sort.*;
/*
Input: array of integers size N, integer Threshold. 
Output: the number of pairs (x, y) of distinct elements with condition x + y <= Threshold. 
Is that possible to implement it with O(n) ?
*/
public class Threshold
{
	public static void main(String args[])
	{
		int a[] = {6,5,3,9,1};				
		a = new QuickSort().quicksort(a,0,a.length-1);
		
		int i=0;
		int j=a.length-1;
		int output = 0;
		int threshold = 8;
		while(i<j)
		{
			if(a[i]+a[j] <= threshold)			
			{
				output+=(j-i)*2;
				i++;
			}
			else
				j--;
		}
		
		System.out.println(output);
	}
}
package algos.algorithms.sort;

public class Algorithms 
{
	
	public static void main(String args[])
	{
		/* Test #1 merge2SortedArrays(); */ 
		int a[] = {0,1,2,5,6,9};
		int b[] = {1,3,7};
		int result[] = new Algorithms().merge2SortedArrays(a, b);
		Quicksort.printArray(result);
		
		
		/* Test #2 convert2DArrayto1DArray(); */ 
		int c[] = {1, 5, 9};
		int d[] = {0, 2, 6};
		int e[] = {1, 3, 7};
		int input[][] = {c,d,e};		
		int result2[] = new Algorithms().convert2DArrayto1DArray(input);
		Quicksort.printArray(result2);
		
	}
	
	/**
	 * Given a 2D sorted array.
	 * (where array[i][j] < array[i][j+1] and array[i][j] < array[i+1][j])
	 * Write a function that converts this to a sorted 1D sorted array.
	 * 
	 */	
	public int[] convert2DArrayto1DArray(int a[][])
	{
		int result[] = merge2SortedArrays(a[0],a[1]);		
		for(int i=2;i<a.length;i++)
		{			
			result = merge2SortedArrays(result,a[i]);			
		}
		return result;
	}	
	
	/**
	 * Given two sorted N & M arrays
	 * Write a function that converts this to 1 sorted sorted array
	 * 
	 * Using the principle of K-Way Merging algorithm !!
	 */
	public int[] merge2SortedArrays(int[] a, int b[])
	{
		int result[] = new int[a.length+b.length];
		int i,j,k;
		i=j=k=0;
		
		while(i<a.length && j<b.length)
		{
			if(a[i]<b[j])
				result[k++]=a[i++];							
			else
				result[k++]=b[j++];			
		}
		if(i<a.length) // you can remove this line... while(i<a.length) already has condition
			while(i<a.length)
				result[k++]=a[i++];
		else // remove this too
			while(j<b.length)
				result[k++]=b[j++];
		
		return result;
	}
}

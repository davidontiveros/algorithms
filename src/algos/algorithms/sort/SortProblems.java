package algos.algorithms.sort;

import algos.algorithms.BaseOperations;

/**
 * 
 * @author daviD_dev
 *
 */
public class Problems
{
	
	public static void main(String args[])
	{
		/* Test #1 merge2SortedArrays();  
		int a[] = {0,1,2,5,6,9};
		int b[] = {1,3,7};
		int result[] = new Problems().merge2SortedArrays(a, b);
		BaseOperations.printArray(result);
		*/
		
		/* Test #2 convert2DArrayto1DArray();  
		int c[] = {1, 5, 9};
		int d[] = {0, 2, 6};
		int e[] = {1, 3, 7};
		int input[][] = {c,d,e};		
		int result2[] = new Problems().convert2DArrayto1DArray(input);
		BaseOperations.printArray(result2);
		*/
		
		/* 9.1 Solution #1 Test mergeOneArrayIntoOther();		
		int a[] = {9};
		int b[] = {2,4,7,8,21,22};
		int c[] = new int[a.length+b.length];		
		for(int i = 0; i < c.length; i++)
		{
			if(i >= a.length)
				c[i] = Integer.MAX_VALUE;
			else 
				c[i] = a[i];
		}
		BaseOperations.printArray(a);		
		BaseOperations.printArray(b);	
		new Problems().mergeOneArrayIntoOther(c, b);
		BaseOperations.printArray(c);
		*/
		
		/* 9.1 Solution #2 Test mergeOneArrayIntoOtherV2(); */
		int c[] = {5,10,12,15};
		int b[] = {2,4,7,8,21};
		int a[] = new int[c.length+b.length];		
		for(int i = 0; i < c.length; i++) 
				a[i] = c[i];		
		mergeOneArrayIntoOtherV2(a, b, 3);
		BaseOperations.printArray(a);
	}
	
	/**
	 * 9.1
	 * You are given two sorted arrays, A and B, 
	 * and A has a large enough buffer at the end to hold B. 
	 * Write a method to merge B into A in sorted order.
	 * 
	 * Complexity O(n*m)
	 */	
	public void mergeOneArrayIntoOther(int a[], int b[])
	{
		int i = 0,j = 0;						
		
		while(j < b.length)
		{			
			// merge to the left
			if(b[j] <= a[i])
			{				
				mergeElementIntoArray(a, i, b[j]);
				j++;
			}
			// merge to the right
			else if( i>0 && i+1<a.length && (b[j]>a[i] && b[j]<a[i+1]) )
			{				
				mergeElementIntoArray(a, i+1, b[j]);
				j++;
			}			
			i++;
		}
	}
	
	
	private void mergeElementIntoArray(int a[], int p, int element)
	{			
		for(int i = a.length-1; i > p; i--)
			a[i] = a[i-1];		
		a[p] = element;	
	}
	
	
	/**
	 * 9.1 - Another solution to problem 9.1 (above) 
	 * with better performance it takes O(n)
	 */
	public static void mergeOneArrayIntoOtherV2(int[] a, int[] b, int tail) 
	{
		int i = tail;
		int j = b.length-1;
		int p = a.length-1;
		
		while(i >=0  && j >= 0)
		{
			if(a[i] > b[j])
				a[p--] = a[i--];							
			else			
				a[p--] = b[j--];			
		}
		
		while(j >= 0)		
			a[p--] = b[j--];			
						
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

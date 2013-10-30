package algos.algorithms.sort;

import algos.algorithms.BaseOperations;

/**
 * Pick a random element and partition the array, 
 * such that all numbers that are less than it come before all elements that are greater than it. 
 * Then do that for each half, then each quarter, etc. 
 * O(n log n) expected, O(n^2) worst case.
 * 
 * @author daviD_dev
 *
 */
public class QuickSort
{
	public static void main(String args[])
	{		
		//String string = "efeefa";
		//System.out.println(string);
		//System.out.println(quicksort(string.toCharArray(),0,string.length()-1));		
		
		int input[] = {2,5,2,2,5,1};
		BaseOperations.printArray(input);
		BaseOperations.printArray(new QuickSort().quicksort(input,0,input.length-1));
	}
	
	public int[] sort(int array[])
	{
		int result[] = new int[array.length];
		for(int i=0; i<array.length;i++)
		{
			result[i]=array[i];
		}
		return quicksort(result, 0, array.length-1);
	}
	
	public Integer[] sort(Integer array[])
	{
		Integer result[] = new Integer[array.length];
		for(int i=0; i<array.length;i++)
		{
			result[i]=array[i];
		}
		return quicksort(result, 0, array.length-1);
	}
	
	public int[] quicksort(int input[], int left, int right)
	{
		int i = left; 
		int j = right;
		int pivot = input[(left+right)/2];
		do
		{
			while(input[i]<pivot ) i++;
			while(input[j]>pivot ) j--;			
			if(i<=j)
			{
				BaseOperations.swap(input,i,j);
				i++;
				j--;
			}
		}while(i<=j);		
		
		if(left<j) 
			input = quicksort(input,left,j);
		if(i<right) 
			input = quicksort(input,i,right);		
			
		return input;
	}
	
	
	public Integer[] quicksort(Integer input[], int left, int right)
	{
		int i = left; 
		int j = right;
		int pivot = input[(left+right)/2];
		do
		{
			while(input[i]<pivot ) i++;
			while(input[j]>pivot ) j--;			
			if(i<=j)
			{
				BaseOperations.swap(input,i,j);
				i++;
				j--;
			}
		}while(i<=j);		
		
		if(left<j) 
			input = quicksort(input,left,j);
		if(i<right) 
			input = quicksort(input,i,right);		
			
		return input;
	}
		
	
	/**
		CHAR ARRAYS SORTING 
	**/
	private char[] quicksort(char string[], int left, int right)
	{		
		int i = left; 
		int j = right;
		int pivotPos = (left+right)/2;
		char pivot = string[pivotPos];
		
		do
		{
			while(string[i]<pivot) i++;
			while(string[j]>pivot) j--;			
			if(i<=j)
			{
				BaseOperations.swap(string,i,j);
				i++;
				j--;
			}
		}while(i<=j);
		
		if(left<j)
			string = quicksort(string,left,j);			
		if(i>right)
			string = quicksort(string,i,right);
		
		return string;
	}	
}
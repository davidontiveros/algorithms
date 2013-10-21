package algos.algorithms.sort;

public class Quicksort
{
	public static void main(String args[])
	{		
		//String string = "efeefa";
		//System.out.println(string);
		//System.out.println(quicksort(string.toCharArray(),0,string.length()-1));		
		
		int input[] = {2,5,2,2,5,1};
		printArray(input);
		printArray(quicksort(input,0,input.length-1));
	}
	
	public static int[] sort(int array[])
	{
		int result[] = new int[array.length];
		for(int i=0; i<array.length;i++)
		{
			result[i]=array[i];
		}
		return quicksort(result, 0, array.length-1);
	}
	
	public static int[] quicksort(int input[], int left, int right)
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
				swap(input,i,j);
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
	
	private static void swap(int input[], int i, int j)
	{
		int aux = input[j];
		input[j]=input[i];
		input[i]=aux;
	}
	
	public static void printArray(int array[])
	{
		for(int o : array)
		{
			System.out.print(o+",");
		}
		System.out.println();
	}
	
	/**
		CHAR ARRAYS SORTING 
	**/
	private static char[] quicksort(char string[], int left, int right)
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
				swap(string,i,j);
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
	
	private static void swap(char string[], int i, int j)
	{
		char aux = string[j];
		string[j]=string[i];
		string[i]=aux;
	}
}
/**
 * 
 */
package algos.algorithms;

/**
 * 
 * @author daviD_dev
 *
 */
public class BaseOperations 
{
	public static void printArray(int array[])
	{
		for(int o : array)
		{
			System.out.print(o+",");
		}
		System.out.println();
	}
	
	public static void printArray(Integer array[])
	{
		for(Integer e : array)
		{
			System.out.print(e+",");
		}
		System.out.println();
	}
	
	public static void printMatrix(int array[][])
	{
		for(int i = 0; i < array.length; i++)
		{
			for(int j = 0; j < array[i].length; j++)
			{
				System.out.print(array[i][j]+",");
			}
			System.out.println();
		}
	}
	
	public static void swap(int input[], int i, int j)
	{
		int aux = input[j];
		input[j]=input[i];
		input[i]=aux;
	}
	
	public static void swap(Integer input[], int i, int j)
	{
		int aux = input[j];
		input[j]=input[i];
		input[i]=aux;
	}
	
	public static void swap(char string[], int i, int j)
	{
		char aux = string[j];
		string[j]=string[i];
		string[i]=aux;
	}
	
	public static void swap(int a[][], int i, int j)
	{
		int aux[] = a[i];
		a[i] = a[j];
		a[j] = aux;
	}
}

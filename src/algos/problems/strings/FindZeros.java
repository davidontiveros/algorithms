package algos.problems.strings;

import algos.algorithms.BaseOperations;

/**
 * 1.7
 * Write an algorithm such that if an element in an MxN matrix is 0, 
 * its entire row and column is set to 0.
 * 
 * @author daviD_dev
 *
 */
public class FindZeros
{
	public static void main(String args[])
	{
		/* Test findZeros 
		int matrix[][] = new int[3][4];
		matrix[0][0]=1;
		matrix[0][1]=2;
		matrix[0][2]=0;
		matrix[0][3]=2;
		matrix[1][0]=6;		
		matrix[1][1]=3;
		matrix[1][2]=9;
		matrix[1][3]=8;
		matrix[2][0]=0;
		matrix[2][1]=1;
		matrix[2][2]=6;
		matrix[2][3]=4;		
		findZeros(matrix);
		*/
		
		/* Test replaceZeros */		
		int a[] = {1,1,1,1};
		int b[] = {1,0,1,1};
		int c[] = {1,1,0,1};
		int matrix[][] = {a,b,c};
		new FindZeros().replaceZeros(matrix);
		BaseOperations.printMatrix(matrix);
	}
	
	/**
	 * Complexity O(n^2)
	 */
	private void replaceZeros(int matrix[][])
	{
		boolean rows[] = new boolean[matrix.length];
		boolean columns[] = new boolean[matrix[0].length];
		
		//find all 0 positions first
		for(int i = 0; i < matrix.length; i++)
		{
			for(int j = 0; j <matrix[i].length; j++)
			{
				// store the row, column position
				if(matrix[i][j] == 0)
					rows[i] = columns[j] = true;				
			}
		}
		
		//replace all rows and columns
		for(int i = 0; i < matrix.length; i++)
		{
			for(int j = 0; j < matrix[i].length; j++)
			{
				if(rows[i] || columns[j])				
					matrix[i][j] = 0;			
			}
		}
	}
	
	public static void findZeros(int[][] matrix)
	{
		int rows[] = new int[matrix.length];
		int columns[] = new int[matrix[0].length];
		
		int pivot = -1;
		
		for(int i=0; i<matrix.length; i++)
		{
			for(int j=0; j<matrix[0].length; j++)
			{
				if(matrix[i][j]==0)
				{
					rows[i]=pivot;
					columns[j]=pivot;
				}
				System.out.print(matrix[i][j]);
			}
			System.out.println();
		}
		
		for(int i=0; i<matrix.length; i++)
		{
			for(int j=0; j<matrix[0].length; j++)
			{
				if(rows[i]==pivot || columns[j]==pivot)
				{
					matrix[i][j]=0;
				}
				System.out.print(matrix[i][j]);
			}
			System.out.println();
		}
	}	
}
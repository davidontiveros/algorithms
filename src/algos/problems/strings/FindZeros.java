package algos.problems.strings;

public class FindZeros
{
	public static void main(String args[])
	{
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
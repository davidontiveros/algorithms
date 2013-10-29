package algos.problems.strings;

/**
 * 
 * @author daviD_dev
 *
 */
public class RotateMatrix
{
	public static void main(String args[])
	{
		int[][] matrix = new int[3][3];
		matrix[0][0] = 1;
		matrix[0][1] = 2;
		matrix[0][2] = 3;
		matrix[1][0] = 4;		
		matrix[1][1] = 5;
		matrix[1][2] = 6;
		matrix[2][0] = 7;
		matrix[2][1] = 8;
		matrix[2][2] = 9;
		printMatrix(matrix, 3);
		System.out.println("\n");
		rotate(matrix, 3);
		//printMatrix(matrix,3);
	}
	
	public static void printMatrix(int [][] matrix, int n)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(matrix[i][j]);
			}
			System.out.print("\n");
		}
	}
	
	public static void rotate(int[][] matrix, int n) 
	{
		for (int layer = 0; layer < n / 2; ++layer) 
		{
			int first = layer;
			int last = n - 1 - layer;
			for(int i = first; i < last; ++i) 
			{
				System.out.println("Movement: "+(i+1));
				int offset = i - first;
				int top = matrix[first][i]; // save top
				// left -> top
				matrix[first][i] = matrix[last-offset][first];
				printMatrix(matrix,3);
				System.out.println("\n");

				 // bottom -> left
				 matrix[last-offset][first] = matrix[last][last - offset];
				printMatrix(matrix,3);
				System.out.println("\n");
				
				 // right -> bottom
				 matrix[last][last - offset] = matrix[i][last];
				printMatrix(matrix,3);
				System.out.println("\n");
				
				 // top -> right
				 matrix[i][last] = top; // right <- saved top
				 printMatrix(matrix,3);
				 System.out.println("\n");				 				 
			 }			
		}
	}
}
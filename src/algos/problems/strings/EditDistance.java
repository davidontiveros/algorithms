package algos.problems.strings;


/**
 * 
 * @author daviD_dev
 *
 */
public class EditDistance
{
	public static void main(String args[])
	{
		String m = args[0];
		String n = args[1];
		System.out.println(	new EditDistance().levenshteinDistance(m.toCharArray(), n.toCharArray()) );
	}
	
	/*
		Implement a function that finds the edit distance of two input strings. 
		There are three types of edit operations: insertion, deletion, and substitution. 
		Edit distance is the minimal number of edit operations to modify a string from one state to the other.
		For example, the edit distance between and  is 3 since the following three edit operations are required to modify one into another:
		
	
		There is no way to achieve it with fewer than three operations.

	*/
	public int levenshteinDistance(char m[], char n[])
	{
	  int d[][] = new int[m.length][n.length];		 		  
	  
	  // dropping all base cases.
	  for(int i=0; i<m.length; i++)
		d[i][0]=i;
	  for(int i=0; i<n.length; i++)
		d[0][i]=i;	 
	 
		for(int j=1; j<n.length;j++)	 
		{
			for(int i=1; i<m.length; i++)
			{
					if(m[i] == n[j]) // they're are equal
						d[i][j]=d[i-1][j-1];
					else										
						d[i][j] = min(d[i-1][j]+1, 			d[i][j-1]+1,		d[i-1][j-1]+1);
									   //deletion  			//insertion 		//substitution
			}
		}
	 
	  return d[m.length-1][n.length-1];
	}
	
	public int min(int a, int b, int c)
	{
		int min = Math.min(a,b);
		return Math.min(min,c);
	}
}
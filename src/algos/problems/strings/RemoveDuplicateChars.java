/**
 * 
 */
package algos.problems.strings;


/**
 * Design an algorithm and write code to remove the duplicate characters 
 * in a string without using any additional buffer. 
 * NOTE: One or two additional variables are fine. 
 * An extra copy of the array is not.
 * 
 * @author daviD_dev
 *
 */
public class RemoveDuplicateChars 
{
	
	public static void main(String[] args) 
	{
		String string = "abbbcadaadaccdfgfgfgf";
		//string = new RemoveDuplicateChars().removeWithBuffer(string);
		string = new RemoveDuplicateChars().removeCharsWithoutBuffer(string);
		System.out.println(string);
	}

	/**
	 * This algo uses an extra buffer with the copy of the original string 
	 * (which make things easier :D )
	 * Complexity O(n^2)
	 * @param str
	 * @return
	 */
	private String removeWithBuffer(String str)
	{
		int j = 0;
		StringBuffer aux = new StringBuffer(str);		
		do		
		{
			char pivot = aux.charAt(j);
			for(int i = j+1; i < aux.length();)
			{
				if(pivot == aux.charAt(i))
					aux.delete(i, i+1);
				else
					i++;
				
			}			
			j++;
			
		}while (j+1 < aux.length());
		
		return aux.toString();		
	}
	
	/**
	 * Here uses no extra buffer just an extra variables:
	 * 	- aux: to be storing the removed chars on string
	 * Complexity : O(n^2)
	 * @param str
	 * @return
	 */
	private String removeCharsWithoutBuffer(String str)
	{
		int j = 0;
		String aux = ""; // we	
		do		
		{
			char pivot = str.charAt(j);
			aux += pivot;
			for(int i = j+1; i < str.length();i++)
			{
				if(pivot != str.charAt(i))
					aux += str.charAt(i);				
			}		
			j++;
			str = aux;
			aux = aux.substring(0,j);
		}while (j+1 < str.length());
		
		return str;		
	}
}

/**
 * 
 */
package algos.problems;

import java.util.ArrayList;
import java.util.List;

/**
 * 8.4
 * Write a method to compute all permutations of a string.
 * 
 * @author daviD_dev
 *
 */
public class StringPermutations 
{
	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		String str = "abcde";		
		
		//List permutations = new StringPermutations().permute(str, 0, new ArrayList<String>());
		List permutations = new StringPermutations().permuteV2(str);
		System.out.println(permutations);
		System.out.println(permutations.size());
	}
	
	/**
	 * Complexity O(n!)
	 * @param str
	 * @return
	 */
	private List<String> permuteV2(String str)
	{
		ArrayList<String> permutations = new ArrayList<String>();
		if(str.length()==1)
		{						
			permutations.add(str);
			return permutations;
		}
		
		char pivot = str.charAt(0);
		String rest = str.substring(1);
		List<String> words = permuteV2(rest);
		for(String word : words)
		{
			for(int i = 0; i <= word.length(); i++)
			{
				permutations.add(permString(word, i, pivot));
			}
		}
		return permutations;
	}
	
	private String permString(String str, int i, char pivot)
	{
		String first = str.substring(0,i);
		String last = str.substring(i);
		return first+pivot+last;
	}

}

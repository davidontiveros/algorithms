/**
 * 
 */
package algos.problems.recursion;

import java.util.ArrayList;
import java.util.List;

/**
 * 8.5
 * Implement an algorithm to print all valid (e.g., properly opened and closed) combinations of n-pairs of parentheses.
 * EXAMPLE:
 * input: 3 (e.g., 3 pairs of parentheses)
 * output: ()()(), ()(()), (())(), ((()))
 * 
 * @author daviD_dev
 *
 */
public class FindAllValidParenthesis 
{

	public static void main(String[] args) 
	{
		int pairsOfParenthesis = 3; 
		new FindAllValidParenthesis().find(0, 0, pairsOfParenthesis,"");
		System.out.println(validCombinations);
	}
	
	static List<String> validCombinations = new ArrayList<String>();	
	private void find(int opened, int closed, int n, String validPath)
	{
		
		//finish
		if(opened == n && closed == n)
		{
			if(!validCombinations.contains(validPath))			
				validCombinations.add(validPath);
			return;
		}			
		
		//first pass or can we add a "(" ?
		if(opened == 0 || opened<n)
		{
			validPath += "(";
			find(++opened,closed, n, validPath);			
		}		

		//can we add a ")" ?
		if(opened>=closed && closed<n)
		{
			validPath += ")";
			find(opened,++closed, n, validPath);
		}
			
	}

}

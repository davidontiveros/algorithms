/**
 * 
 */
package algos.problems.recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * 
 * Find all subsets of a set.
 * Recursion ...
 * 
 * @author daviD_dev
 *
 */
public class FindAllSubsets 
{	
	public static void main(String[] args) 
	{	
		String set = "abc";		
		List subsets = new FindAllSubsets().findSubsets(set, new ArrayList(), 1);
		System.out.println(subsets);
	}

	/**
	 * For abc :
	 * 				i~i+offset
	 * a 	0~1		0~0+1
	 * b 	1~2		1~1+1
	 * c 	2~3		2~2+1
	 * ab 	0~2		0~0+2
	 * bc 	1~3		1~1+2
	 * abc 	0~3		0~0+3
	 */
	private List findSubsets(String set, List allSubsets, int offset)
	{
		if(offset > set.length())
			return allSubsets;
		
		for(int i=0; i+offset<=set.length(); i++)
			allSubsets.add(set.substring(i, i+offset));					
		
		return findSubsets(set, allSubsets, offset+1); 
	}
}

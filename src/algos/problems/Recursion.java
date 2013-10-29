package algos.problems;

import java.util.*;

/**
 * 
 * @author daviD_dev
 *
 */
public class Recursion
{
	public static void main(String args[])
	{
		TreeSet<Integer> set = new TreeSet<Integer>();	
		set.add(1);set.add(2);set.add(3);set.add(4);
		new Recursion().getAllSubsets(set, set.size());
	}
	
	List<Set<Integer>> sets = new ArrayList<Set<Integer>>(); 
	/**
	 * Write a method that returns all subsets of a set
	 */
	public void getAllSubsets(TreeSet<Integer> set, int offset)
	{	
		if(offset < 0)
			return;				
		for(int start=1, end=start+offset; end<=set.size();  start++, end++)
		{			
			sets.add(set.subSet(start,true, start+offset,true));			
		}			
		getAllSubsets(set, --offset);
	}
}
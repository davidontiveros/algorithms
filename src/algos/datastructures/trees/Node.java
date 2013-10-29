package algos.datastructures.trees;

/**
 * 
 * @author daviD_dev
 *
 */
public class Node
{
	public Node parent = null;
	public Node left = null;
	public Node right = null;
	public boolean visited = false;
	
	public int id;
	public String name = null;
	
	public int weight;
	public String color = null;
	
	Node(int id, String name)
	{
		this.id = id;
		this.name = name;
	}
	
	Node(String name)
	{		
		this.name = name;
	}
	
	public String toString()
	{
		String out = name;
		return out;
	}
}
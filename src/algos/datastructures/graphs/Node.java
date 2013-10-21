package algos.datastructures.graphs;

public class Node
{
	public String name = null;	
	public int number;
	public boolean visited=false;
	
	public Node(String name)
	{		
		this.name = name;
	}
	
	public String toString()
	{		
		return this.name;
	}
	
	public boolean equals(Object o)
	{	
		if(o == this)
			return true;
		if(!(o instanceof Node))		
			return false;
		
		Node n = (Node) o;
		return n.name.equals(this.name);
	}
}
package algos.datastructures.lists;

/**
 * 
 * @author daviD_dev
 *
 */
public class Node
{
	public String val;
	public Integer intVal;
	public Node next;	
	
	public Node(String val)
	{		
		this.val = val;
	}
	
	public Node(Integer intVal)
	{		
		this.intVal = intVal;
	}
	
	@Override
	public boolean equals(Object o)
	{
		if(o == null) return false;
		if(this == o) return true;
		if(	!(o instanceof Node) ) return false;
		Node n = (Node)o;
		return (this.val==n.val);
	}
	
	@Override
	public String toString()
	{
		return this.val;
	}
}

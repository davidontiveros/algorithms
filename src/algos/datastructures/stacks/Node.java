package algos.datastructures.stacks;

/**
 * 
 * @author daviD_dev
 *
 */
public class Node
{
	public String value;
	public int intValue;
	Node next;
	
	public Node(){};
	public Node(String value){ this.value = value; };
	public Node(int value){ this.intValue = value; };
}

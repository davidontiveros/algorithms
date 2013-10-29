package algos.datastructures.graphs;

/**
 * 
 * @author daviD_dev
 *
 */
public class Vertex
{
	public Node nodeA;
	public Node nodeB;
	public int weight;
	boolean visited = false;
	
	public Vertex(Node nodeA, Node nodeB)
	{
		this.nodeA = nodeA;
		this.nodeB = nodeB;
	}
	
	public Vertex(Node nodeA, Node nodeB, int weight)
	{
		this.nodeA = nodeA;
		this.nodeB = nodeB;
		this.weight = weight;
	}
	
}
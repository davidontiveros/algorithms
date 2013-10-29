package algos.datastructures.graphs;

import java.util.*;

/**
 * 
 * @author daviD_dev
 *
 */
public class UndirectedGraph
{	
	Node[] nodes;
	int ady[][];	
	public int nodesPointer;	
	
	public UndirectedGraph(int n)
	{
		this.nodes = new Node[n];
		this.ady = new int[n][n];
		nodesPointer = 0;
	}
	
	public Node addNode(String name)
	{
		Node node = new Node(name);
		node.number = nodesPointer;
		nodes[nodesPointer++] = node;		
		return node;
	}
	
	public void addLink(String a, String b)
	{
		Node n1 = getNode(a);
		Node n2 = getNode(b);		
		if( n1!=null && n2!=null)
		{
			ady[n1.number][n2.number] = 1;
		}		
	}
	
	public void addLink(String a, String b, int weight)
	{
		Node n1 = getNode(a);
		Node n2 = getNode(b);		
		if( n1!=null && n2!=null)
		{
			ady[n1.number][n2.number] = weight;
		}			
	}
	
	public List<Node> getAdyacents(Node node)
	{		
		List<Node> adyacents = new ArrayList<Node>();
		for(int i=0; i<ady[node.number].length;i++)
		{
			if(ady[node.number][i] == 1)
			{
				adyacents.add(getNode(i));
			}
		}
		return adyacents;
	}
	
	public Node[] getAdyacentsArray(Node node)
	{				
		Node adyacents[] = new Node[nodesPointer+1];
		for(int i=0; i<ady[node.number].length;i++)
		{
			if(ady[node.number][i] == 1)
			{
				adyacents[i]=getNode(i);
			}
		}
		return adyacents;
	}
	
	public Node getNode(String name)
	{
		for(Node n : nodes)
		{
			if(n.name==name)
				return n;
		}
		return null;
	}
	
	public Node getNode(int number)
	{
		for(Node n : nodes)
		{
			if(n.number==number)
				return n;
		}
		return null;
	}
	
	public void printAdyMatrix()
	{
		for(int i=0; i<nodes.length; i++)
		{				
			for(int j=0; j<nodes.length; j++)
			{
				System.out.print(ady[i][j]+" ");
			}
			System.out.print("\n");
		}
	}
}
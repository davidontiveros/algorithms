package algos.datastructures.graphs;

import java.util.*;

/**
 * 
 * @author daviD_dev
 *
 */
public class Problems
{
	static UndirectedGraph graph = new UndirectedGraph(9);	
	static boolean founded = false;	
	
	public static void main(String args[])
	{				
		graph.addNode("A");
		graph.addNode("B");
		graph.addNode("C");
		graph.addNode("D");
		graph.addNode("E");
		graph.addNode("F");
		graph.addNode("X");
		graph.addNode("Y");
		graph.addNode("Z"); //9
		
		graph.addLink("A","B");
		graph.addLink("A","C");
		graph.addLink("B","A");
		graph.addLink("B","F");
		graph.addLink("C","A");
		graph.addLink("C","D");
		graph.addLink("D","C");
		graph.addLink("D","E");
		graph.addLink("E","D");
		graph.addLink("F","B");
		graph.addLink("X","Y");
		graph.addLink("Y","Z");
		
		//new Algorithms().routeExists(graph.getNode("A"),graph.getNode("E"));
		boolean result = new Problems().routeExistsIterative(graph.getNode("F"),graph.getNode("C"));		
		System.out.println(result);
	}
	
	private List<Node> visited = new ArrayList<Node>();	
	public void routeExists(Node a, Node b)
	{					
		//LinkedList<Node> stack = new LinkedList<Node>();
		List<Node> adys = graph.getAdyacents(a);				
		visited.add(a);		
		for(Node n : adys)
		{					
			if(!visited.contains(n))
			{				
				if(n.equals(b))
				{
					//return true;
					founded = true;
					break;
				}
				else
				{										
					routeExists(n,b);
				}
			}		
		}		
	}
	
	public boolean routeExistsIterative(Node a, Node b)
	{									
		LinkedList<Node> stack = new LinkedList<Node>();	
		List<Node> adys = graph.getAdyacents(a);
		stack.addAll(adys);
		visited.add(a);
		while(!stack.isEmpty())
		{	
			Node n = stack.poll();
			if(!visited.contains(n))
			{
				visited.add(n);
				if(n.equals(b))
					return true;							
				stack.addAll(graph.getAdyacents(n));
			}		
		}
		return false;
	}
}

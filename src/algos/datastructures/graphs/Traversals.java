/**
 * 
 */
package algos.datastructures.graphs;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.Queue;

/**
 * @author daviD_dev
 *
 */
public class Traversals 
{
	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{	
		
		UndirectedGraph graph = new UndirectedGraph(8);	
		
		graph.addNode("A");
		graph.addNode("B");
		graph.addNode("C");
		graph.addNode("D");
		graph.addNode("E");
		graph.addNode("F");
		graph.addNode("G");
		graph.addNode("H");
		
		graph.addLink("A","B"); //A
		graph.addLink("A","D");
		graph.addLink("A","G");		
		graph.addLink("B","F");	//B
		graph.addLink("B","A");
		graph.addLink("B","E");
		graph.addLink("E","B");	//E
		graph.addLink("E","G");
		graph.addLink("G","E"); //G
		graph.addLink("G","A");
		graph.addLink("D","A"); //D
		graph.addLink("D","F");
		graph.addLink("F","B"); //F
		graph.addLink("F","D");
		graph.addLink("F","C");
		graph.addLink("C","F"); //C
		graph.addLink("C","H");
		
		Node node = graph.getNode("A");
		System.out.println("BFS: ");new Traversals().BFS(graph, node);		
		System.out.println("DFS: ");new Traversals().DFS(graph, node);
	}
	
	
	static Queue<Node> queue = new ArrayDeque<Node>();
	static Deque<Node> stack = new ArrayDeque<Node>();
	static List<Node> visited = new ArrayList<Node>();
	
	/**
	 * This traversal visits all its immediately sibling nodes each by each, then when it finishes
	 * starts with the first visited. Its a kind of level traversing.
	 * 
	 * Data Structure: QUEUE (FIFO)
	 * 
	 * 1- Add ROOT to queue
	 * 2- Remove NODE from queue
	 * 3- If not visited yet, visit it.
	 * 3- For each adjacent, if not visited: queue it
	 * 4- Repeat step 2 by recursion
	 * Finish until queue is empty.
	 */
	
	private void BFS(UndirectedGraph graph, Node root)
	{
		queue.add(root);		
		BFS_traverse(graph);
		visited.clear();
	}
	private void BFS_traverse(UndirectedGraph graph)
	{
		if(queue.isEmpty())
			return;
		
		Node node = queue.remove();
		if(!visited.contains(node))
		{
			visited.add(node);
			System.out.print(node+",");
		}
				
		for(Node ady : graph.getAdyacents(node))
		{
			if(!visited.contains(ady))			
				queue.add(ady);			
		}
		BFS_traverse(graph);
	}
	
	
	/**
	 * This traversal visits its immediately sibling node and does the same for its current visited sibling.
	 * At different from BFS, this doesn't stop on each level of the graph to traverse each node, it cotinues
	 * deeply.
	 * 
	 * Data Struct: STACK (LIFO)
	 * 
	 * 1- Add ROOT to stack.
	 * 2- Remove NODE from stack.
	 * 3- Visit it
	 * 4- For each adjacent, If not visited: add it to stack and repeat step2
	 * Finish until stack is empty
	 */
	private void DFS(UndirectedGraph graph, Node root)
	{
		stack.add(root);
		DFS_traverse(graph);
		visited.clear();
	}
	private void DFS_traverse(UndirectedGraph graph)
	{
		if(stack.isEmpty())
			return;
		
		Node node = stack.remove();
		visited.add(node);
		System.out.print(node+",");				
		for(Node ady : graph.getAdyacents(node))
		{		
			if(!visited.contains(ady))
			{
				stack.add(ady);
				DFS_traverse(graph);
			}			
		}	
		DFS_traverse(graph);
	}
}

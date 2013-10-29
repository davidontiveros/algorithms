package algos.datastructures.trees;

import java.util.*;

/**
 * 
 * @author daviD_dev
 *
 */
public class BreadthFirstTraversal
{
	private LinkedList<Node> queue = new LinkedList<Node>();
	
	public void traverse(Node root)
	{	
		enQueue(root);
		
		while(!queue.isEmpty())
		{
			Node node = deQueue();
			visitNode(node);
			if(node.left!=null)
				enQueue(node.left);
			if(node.right!=null)
				enQueue(node.right);
		}
	}
	
	private void visitNode(Node node)
	{
		node.visited=true;
		System.out.print(node.name+",");			
	}
	
	
	private  void enQueue(Node node)
	{
		queue.add(node);
	}
	
	private  Node deQueue()
	{
		return queue.poll();
	}	
	
}
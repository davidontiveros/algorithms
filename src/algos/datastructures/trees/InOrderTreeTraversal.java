package algos.datastructures.trees;

/**
 * 
 * @author daviD_dev
 *
 */
public class InOrderTreeTraversal
{		
	public  void traverse(Node node)
	{		
		if(node==null) return;			
		traverse(node.left);
		visitNode(node);
		traverse(node.right);		
	}
	
	private  void visitNode(Node node)
	{
		node.visited=true;
		System.out.print(node.name+",");			
	}
	
}
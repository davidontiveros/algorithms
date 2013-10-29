package algos.datastructures.trees;

/**
 * 
 * @author daviD_dev
 *
 */
public class PreOrderTreeTraversal
{		
	public  void traverse(Node node)
	{				
		if(node==null) return;
		visitNode(node);	
		traverse(node.left);
		traverse(node.right);
	}
	private  void visitNode(Node node)
	{
		node.visited=true;
		System.out.print(node.name+",");
	}
}
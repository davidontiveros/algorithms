package algos.datastructures.trees;

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
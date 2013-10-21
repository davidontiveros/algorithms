package algos.datastructures.trees;

public class PostOrderTreeTraversal
{
	
		
	public  void traverse(Node node)
	{	
		if(node==null)return;		
		traverse(node.left);
		traverse(node.right);
		visitNode(node);		
	}
	
	private  void visitNode(Node node)
	{
		node.visited=true;
		System.out.print(node.name+",");			
	}	
	
}
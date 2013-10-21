package algos.datastructures.trees;

public class BalancedBinaryTree
{
	public static void main(String args[])
	{
		Node rootNode = new Node("1");		
		
		// level 1
		rootNode.left = new Node("2");
		// level 2 - left node
		rootNode.left.left = new Node("3");	
		rootNode.left.right = new Node("4");;		
		
		rootNode.right = new Node("5");
		// level 2 - right node		
		rootNode.right.left = new Node("6");
		rootNode.right.right = new Node("7");			
		
		
		//PreOrder Traversal
		//PreOrderTreeTraversal.traverse(rootNode);				
		
		//PreOrder Traversal
		//InOrderTreeTraversal.traverse(rootNode);
	}
}
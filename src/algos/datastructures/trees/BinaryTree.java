package algos.datastructures.trees;

/**
 * 
 * @author daviD_dev
 *
 */
public class BinaryTree
{
	public static void main(String args[])
	{
		Node tree = new Node("F");	
		// level 1 - B node
		tree.left = new Node("B");
		// level 2 - B node
		tree.left.left = new Node("A");	
		tree.left.right = new Node("D");
		// level 3 - D node
		tree.left.right.left = new Node("C");
		tree.left.right.right = new Node("E");		
		// level 1 - G node
		tree.right = new Node("G");
		// level 2 - G node
		tree.right.right = new Node("I");
		// level 3 - I node
		tree.right.right.left = new Node("H");						
		System.out.print("\nPre-order traversal: ");
		new PreOrderTreeTraversal().traverse(tree);
		
		tree = new Node("F");				
		tree.left = new Node("B");	
		tree.left.left = new Node("A");	
		tree.left.right = new Node("D");
		tree.left.right.left = new Node("C");
		tree.left.right.right = new Node("E");		
		tree.right = new Node("G");
		tree.right.right = new Node("I");
		tree.right.right.left = new Node("H");		
		System.out.print("\nIn-order traversal: ");
		new InOrderTreeTraversal().traverse(tree);		
		
		tree = new Node("F");	
		tree.left = new Node("B");
		tree.left.left = new Node("A");	
		tree.left.right = new Node("D");
		tree.left.right.left = new Node("C");
		tree.left.right.right = new Node("E");		
		tree.right = new Node("G");
		tree.right.right = new Node("I");
		tree.right.right.left = new Node("H");		
		System.out.print("\nPost-order traversal: ");
		new PostOrderTreeTraversal().traverse(tree);
		
		tree = new Node("F");	
		tree.left = new Node("B");
		tree.left.left = new Node("A");	
		tree.left.right = new Node("D");
		tree.left.right.left = new Node("C");
		tree.left.right.right = new Node("E");		
		tree.right = new Node("G");
		tree.right.right = new Node("I");
		tree.right.right.left = new Node("H");			
		System.out.print("\nBreadth-First traversal: ");
		new BreadthFirstTraversal().traverse(tree);
					
	}
}
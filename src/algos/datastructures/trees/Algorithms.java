package algos.datastructures.trees;

import java.lang.Math;
import java.util.*;

public class Algorithms
{
	public static void main(String args[])
	{
		/*
		Node tree = new Node("A");
		
		tree.left = new Node("B");
		tree.left.right = new Node("X");
		tree.left.left = new Node("D");
		tree.left.left.left = new Node("E");
		
		tree.right = new Node("C");		
		tree.right.left = new Node("X");
		tree.right.right = new Node("F");
		tree.right.right.right = new Node("G");
		//tree.right.left.right = new Node("R");
		
		new Algorithms().isBalanced(tree);
		*/
		
		Node tree = new Node("8");
		
		tree.left = new Node("3");		
		tree.left.left = new Node("1");						
		tree.left.right = new Node("6");
		tree.left.right.left = new Node("4");
		tree.left.right.right = new Node("7");
		
		tree.right = new Node("10");		
		tree.right.right = new Node("14");
		tree.right.right.left = new Node("13");
				
		new Algorithms().goTraverse(tree);		
	}
	
	Map< Integer,LinkedList<Node> > linkedLists = new HashMap<Integer, LinkedList<Node> >();
	public void goTraverse(Node tree)
	{
		traverse(tree, 0);
		for(int i=0; i<=linkedLists.size();i++)
		{
			System.out.println(linkedLists.get(i));
		}
	}
	public void traverse(Node node, int level)
	{
		if(node==null)		
			return;
		
		System.out.println("node :"+node.name+" @ level "+level);
		level++;
		pushIntoLinkedList(node,level);
		traverse(node.left, level);
		traverse(node.right, level);
	}
	
	public int findNextNode(Node node, Node targetNode)
	{
		//targetNode not found
		if(node==null)
			return 0;
		
		if(node.equals(targetNode))
		{
			//its the root
			if(node.parent==null)
			{
				if(node.left==null)
					return node.id-=1;
				if(node.right==null)
					return node.id+=1;
			}
			else
			{
				if(node.left == null)
					return calculateNextNode(node,node.parent,true);
				if(node.right == null)
					return calculateNextNode(node,node.parent,false);
			}			
		}
		else
		{
			if(node.left == null)
				return findNextNode(node.left, targetNode);
			if(node.right == null)
				return findNextNode(node.right, targetNode);
		}
		return 0;
	}
	
	public int calculateNextNode(Node n, Node parent, boolean left)
	{
		int next=n.id;
		if(left)
		{			
			while(n.id==parent.id)			
				next--;			
		}
		else
		{
			while(n.id==parent.id)			
				next++;
		}
		return next;
	}
	
	public void pushIntoLinkedList(Node n, int level)
	{
		if(this.linkedLists.containsKey(level))		
			this.linkedLists.get(level).add(n);		
		else
		{
			LinkedList<Node> linkedList = new LinkedList<Node>();
			linkedList.add(n);
			linkedLists.put(level,linkedList);
		}
	}
	
	public void isBalanced(Node root)
	{
		System.out.println(maxHeight(root.left) +","+minHeight(root.right));
	}
	
	public int minHeight(Node n)
	{
		if(n==null)
			return 0;
		
		return 1 + (Math.min(minHeight(n.left),minHeight(n.right)));
	}
	
	public int maxHeight(Node n)
	{
		if(n==null)
			return 0;
		
		return 1 + (Math.max(maxHeight(n.left),maxHeight(n.right)));
	}
}
package algos.datastructures.lists;

/*
	Write code to remove duplicates from an unsorted linked list.
	FOLLOW UP
	How would you solve this problem if a temporary buffer is not allowed?
*/
public class RemoveLinkedListDuplicates
{
	public static void main(String args[])
	{
		// First sort the linked list (i.e. using mergesort) and then you will have a list like below
		/*
		Node linkedList = new Node("A");
		add(linkedList, new Node("B"));
		add(linkedList, new Node("B"));
		add(linkedList, new Node("B"));
		add(linkedList, new Node("C"));
		add(linkedList, new Node("D"));
		add(linkedList, new Node("E"));
		add(linkedList, new Node("E"));
		add(linkedList, new Node("E"));
		add(linkedList, new Node("F"));
		*/
		
		int x = 192+123;
		String s = String.valueOf(x);
		
		/*
		traverse(linkedList);
		removeDuplicates(linkedList);
		traverse(linkedList);
		*/
	}
	
	public static void removeDuplicates(Node head)
	{
		if(head.next == null)
			return;
		
		Node runner = head.next;
		Node duplicateChecker = head;
		do
		{
			if(runner.equals(duplicateChecker))			
				duplicateChecker.next = runner.next;			
			else			
				duplicateChecker = runner;
			runner = runner.next;
		}while(runner != null);		
	}
	
	//Implement an algorithm to delete a node in the middle of a single linked list, given only access to that node.
	public static void deleteNode(Node n)
	{
		// B -> C -> D -> E
		// n = B
		
		// next	= C	
		Node next = n.next;
		// n.val = C
		n.val = next.val;	
		n.next = next.next; // next.next = D
		
		// now you have
		// n = C -> D -> E
	}
	
	/*
	You have two numbers represented by a linked list, where each node contains a single digit. 
	The digits are stored in reverse order, such that the 1’s digit is at the head of the list. 
	Write a function that adds the two numbers and returns the sum as a linked list.
	EXAMPLE
		Input: (3 -> 1 -> 5), (5 -> 9 -> 2)
		Output: 8 -> 0 -> 8
	*/
	public static Node sumThatShit(Node node1, Node node2, int extraCarry, Node result)
	{
		if(node1==null && node2==null)
			return result;
		
		int sum = extraCarry;		
		if(node1.val != null)
			sum += node1.intVal;
		if(node2.val != null)
			sum += node2.intVal;
		
		if(sum > 10)
		{
			sum = sum - 10;
			extraCarry = 1;
		}
		else
			extraCarry = 0;	
				
		if(result == null)
			result = new Node(sum);
		
		return sumThatShit( node1.next != null ? node1.next : null,
							node2.next != null ? node2.next : null, 
							extraCarry,
							result.next);
	}
}






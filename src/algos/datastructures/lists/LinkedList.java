package algos.datastructures.lists;

/**
 * 
 * @author daviD_dev
 *
 */
public class LinkedList
{
	public static void main(String args[])
	{
		/*
		Node linkedList = new Node("A");
		add(linkedList, new Node("B"));			
		add(linkedList, new Node("C"));
		add(linkedList, new Node("D"));
		add(linkedList, new Node("E"));				
		add(linkedList, new Node("F"));
					
		traverse(linkedList);		
		search(linkedList, new Node("E"));
		remove(linkedList,new Node("E"));
		remove(linkedList,new Node("A"));
		traverse(linkedList);	
		*/
		Node list1 = new Node(3);
		add(list1, new Node(1));			
		add(list1, new Node(5));
		
		Node list2 = new Node(5);
		add(list2, new Node(9));			
		add(list2, new Node(2));
		
		Node result = sumThatShit(list1, list2, 0, null);
		traverse(result);	
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
			return null;
				
		
		int sum = extraCarry;		
		if(node1 != null)
			sum += node1.intVal;
		if(node2 != null)
			sum += node2.intVal;
		
		if(sum >= 10)
		{
			sum = sum - 10;
			extraCarry = 1;
		}
		else
			extraCarry = 0;	
						
		
		if(result == null)
			result = new Node(sum);
		else
			add(result, sumThatShit( node1 != null ? node1.next : null,
									node2 != null ? node2.next : null, 
									extraCarry, result) );		
		
		return result;
	}
	
	// O(n)
	public static void traverse(Node head)
	{
		System.out.println();
		System.out.print(head.val != null ? head.val : head.intVal);
		Node pointer = head;
		while(pointer.next!=null)
		{
			pointer = pointer.next;
			System.out.print(" -> "+ (head.val != null ? head.val : head.intVal) );
		}
		System.out.print(" -> "+null);
	}
	
	// O(n)
	public static void add(Node head, Node node)
	{		
		Node tail = head;
		while(tail.next != null)
		{
			tail = tail.next;
		}
		tail.next = node;
	}
	
	// O(n)
	public static void search(Node head, Node node)
	{
		System.out.println();
		Node pointer = head;
		System.out.print(pointer.val);
		while(pointer.next != null)
		{
			pointer = pointer.next;
			if(pointer.val == node.val)
				System.out.print(" -> ["+pointer.val+"]");
			else
				System.out.print(" -> "+pointer.val);
		}
		System.out.print(" -> "+null);
	}
	
	// O(n)
	public static void remove(Node head, Node node)
	{
		if(head.val == node.val)
		{			
			Node next = head.next;			
			head.val = next.val;
			if(next != null)
				head.next = next.next;
			else
				head.next = next;
			return;
		}
		
		Node pointer = head;
		Node previous = pointer;				
		while(pointer.next != null)
		{
			if(pointer.val == node.val)
			{		
				previous.next = pointer.next;
				return;
			}
			previous = pointer;	
			pointer = pointer.next;					
		}
	}
}
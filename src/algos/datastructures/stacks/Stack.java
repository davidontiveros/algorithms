package algos.datastructures.stacks;

/*
	A stack is a particular kind of abstract data type in which the principal operations are the addition of an entity to the collection, 
	known as push and removal of an entity, known as pop. 
	The stack is a Last-In-First-Out (LIFO) data structure, the last element added to the structure must be the first one to be removed. 
	Adding items to or removing items from the end is O(1) time.
*/
public class Stack
{

	public static void main(String args[])
	{
		Stack myStack = new Stack();
		myStack.push( new Node(1) );
		myStack.push( new Node(2) );
		myStack.push( new Node(3) );
		myStack.traverse();
	}
	
	private Node top;
	
	public void traverse()
	{
		String output = "";
		while(top != null)
		{									
			output = output + "["+top.intValue+"]\n";
			top = top.next;
		}
		System.out.println(output);
	}
	
	public void push(Node n)
	{
		if(top != null)
		{
			Node aux = top;
			top = n;
			n.next = aux;
		}
		else
			top = n;
	}
	
	public Node pop()
	{
		if(top.next != null)
		{
			Node aux = new Node();
			aux.value = top.value;
			aux.intValue = top.intValue;
			top = top.next;
			return aux;
		}
		else
			return top;
	}
}

/*
	3.1 - Describe how you could use a single array to implement three stacks.
	
	lets say N = size of the array;
	
	Node array[] = new array[N*3];
	
	int top1 = N-1;
	int top2 = (N*2)-1;
	int top3 = (N*3)-1;
	
	void push(Node n, int topOfWhichQueue)
	{
		for(int i = topOfWhichQueue; i>1; i--)
		{
			array[i-1] = array[i];
		}
		array[topOfWhichQueue] = n;
	}
	
	Node pop(int topOfWhichQueue)
	{
		Node aux = array[topOfWhichQueue];
		for(int i = 0; i<topOfWhichQueue; i++)
		{			
			if(array[i]==null)
				continue;				
			array[i+1] = array[i];
		}		 
		 return aux;
	}
*/
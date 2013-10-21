package algos.problems;

public class XOROperations
{
	public static void main(String args[])
	{
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		
		new XOROperations().swap(a,b);		
	}
	
	/*
		Let’s assume all numbers except two occur twice in an array. 
		How do you get those two numbers to occur only once in O(n) time and O(1) space?
		For example, only two numbers, 4 and 6, in the array {2, 4, 3, 6, 3, 2, 5, 5} occur once, 
		and the others numbers occur twice. Therefore, the output should be 4 and 6.
	*/
	public void findNonRepeatedNumbers(int array[])
	{		
		for(int i=1; i<array.length; i++)
		{
			array[i-1]=array[i-1]^array[i];	
		}
	}
	
	public void swap(int a, int b)
	{
		System.out.println(a+","+b);		
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println(a+","+b);
	}
}
package algos.problems;

import algos.algorithms.sort.*;

/*
You have k lists of sorted integers. Find the smallest range that includes at least one number from each of the k lists. 

For example, 
List 1: [4, 10, 15, 24, 26] 
List 2: [0, 9, 12, 20] 
List 3: [5, 18, 22, 30] 

The smallest range here would be [20, 24] as it contains 24 from list 1, 20 from list 2, and 22 from list 3.
*/
public class MinimumRange
{
	static int a1[] = {4, 10, 15, 24, 26};
	static int a2[] = {0, 9, 12, 20};
	static int a3[] = {5, 18, 22, 30};	
	static int p1, p2, p3;
	static boolean stop = false;
		
	public static void main(String args[])
	{	
		p1 = p2 = p3 = 0;
		
		//Algo starts
			
		// {0,4,5}, intialize the heap
		int heap[] = {a1[p1],a2[p2],a3[p3]};
		System.out.println("initial: ");Quicksort.printArray(heap);
		int heapSorted[] = Quicksort.sort(heap);		
		int minRange = heapSorted[2] - heapSorted[0];		
		int minHeap[] = {heap[0],heap[1],heap[2]};
		while(true)
		{	
			//find the next min element from the lists.
			heap = assignNextMin(heap);						
			//we finish
			if(stop)
				break;			
			heapSorted = Quicksort.sort(heap);
			int range = heapSorted[2] - heapSorted[0];
			System.out.println("range: "+range);
			//calculate and keep track of the actual range
			if( range < minRange)
			{				
				minRange = range;			
				minHeap[0] = heap[0];
				minHeap[1] = heap[1];
				minHeap[2] = heap[2];
			}
		}
		heapSorted = Quicksort.sort(minHeap);
		System.out.println("["+heapSorted[0]+","+heapSorted[2]+"]");		
	}
	
	public static int[] assignNextMin(int heap[])
	{		
		int pos = -1;
		int min = 0;
		if( a1.length > (p1+1) )
		{			
			min = a1[p1+1];
			pos = 0;
		}		
		if( a2.length > (p2+1) )
		{
			int value = a2[p2+1];
			if(value < min)
			{
				min = value;			
				pos = 1;
			}
		}			
		if( a3.length > (p3+1))
		{
			int value = a3[p3+1];
			if(value < min)
			{
				min = value;			
				pos = 2;
			}
		}
				
		if(pos<0)
			stop = true;
		else
		{
			heap[pos] = min;
			switch(pos)
			{
				case 0: p1++; break;
				case 1: p2++; break;
				case 2: p3++; break;
			}			
		}
		Quicksort.printArray(heap);
		return heap;
	}	
}
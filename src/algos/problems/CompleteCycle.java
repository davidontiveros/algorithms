package algos.problems;


/*
	The problem is as follows:
	We have stations and a train that runs between them with a fuel tank
	Let us say that stations are arranged in a circular fashion, so you could complete a cycle from a station and come back to itself
	Now, the problem is with fuel
	At every station you get x amount of fuel, and you need fuel y to reach the next station
	For example, if we have stations A and B, you get fuel 5 at station A, and distance to B is 2, then you will have fuel left as 3 when you reach B
	And let us say you get fuel 4 at B, total = 7, if B to C you need 8 that means you cannot go further, so A is not a possible start point to complete a cycle
	Given the fuel we get at each station and distance from every station to the next, find a start point from which you can complete a cycle
*/
public class CompleteCycle
{
	static int fuelAtStation[] = {5,3,4,3,1};
	static int distance[] = {-7,-2,-3,-3,-2};
	static String station[] = {"A","B","C","D","E"};
	
	public static void main(String args[])
	{					
		// form the cycle into a big array
		int totalSize = fuelAtStation.length*2 + distance.length*2;
		int array[] = new int[totalSize];

		int x = 0;
		int y = x+1;
		for(int i=0;i<fuelAtStation.length;i++)
		{			
			array[x]=fuelAtStation[i];
			array[y]=distance[i];
			array[x+10]=fuelAtStation[i];
			array[y+10]=distance[i];			
			x+=2;
			y+=2;
		}
		
		find(array);
			
	}
	
	public static void find(int array[])
	{
		int max_sum = array[0];
		int current_sum = array[0];
		int begin = 0;
		int end = 0;
		
		for(int i=0; i<array.length;i++)
		{
			// calculate
			if(current_sum < 0)
			{
				current_sum = array[i];			
				begin = i;
			}				
			else
				current_sum += array[i];			
			
			// calculate max_sum
			if(current_sum >= max_sum && (i-begin)>10)
			{
				max_sum = current_sum;
				end = i;
			}				
		}
		/*
		if(begin>10)
		{
			String iStation = iStation[]			
		}
		else
		{
			String eStation = iStation[begin];
		}
		*/
		System.out.println("from "+begin+"-"+end+" , ["+array[begin]+","+array[end]+"]");
		//return max_sum;
	}
}
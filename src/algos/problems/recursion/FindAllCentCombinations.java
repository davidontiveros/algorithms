/**
 * 
 */
package algos.problems.recursion;

/**
 * 8.7 
 * Given an infinite number of:
 * 
 * Quarter 	->	25 cents 
 * Dimes 	->	10 cents 
 * Nickel	-> 	5 cents 
 * Pennies	->	1 cent 
 * 
 * Write code to calculate the number of ways of representing n cents.
 * 
 * @author daviD_dev
 *
 */
public class FindAllCentCombinations 
{
	
	public static void main(String[] args) 
	{
		/**/
		new FindAllCentCombinations().find(11);		
		System.out.println(" # of WAYS "+ways);
		
		
		//System.out.println(makeChange(10,10));
	}

	static int ways = 0;
	static int quarters = 0;
	static int dimes = 0;
	static int nickels = 0;
	static int pennies = 0;	
	
	private void find(int n)
	{				
		if(n == 0)
		{
			ways++;			
			System.out.println("way #"+ways+" with "
			+quarters+" quarters, "
			+dimes+" dimes, "
			+nickels+" nickels, and "
			+pennies+" pennies.");	
			
			//clear old calculations
			quarters=dimes=nickels=pennies=0;
			
			return;
		}
		//quarter
		if(n >= 25)
		{			
			quarters++;			
			find(n-25);
		}

		//dime
		if(n >= 10)
		{			
			dimes++;			
			find(n-10);
		}
		
		//nickel
		if(n >= 5)
		{
			nickels++;			
			find(n-5);		
		}
		
		// pennies
		/*
		pennies += n;
		find(n-n);
		*/			
	}
	
	/**
	 * ** Solution provided by book **
	 */
	public static int makeChange(int n, int denom) {
		int next_denom = 0;
		switch (denom) {
		case 25:
			next_denom = 10;
			break;
		case 10:
			next_denom = 5;
			break;
		case 5:
			next_denom = 1;
			break;
		case 1:
			return 1;
		}
		int ways = 0;
		for (int i = 0; i * denom <= n; i++) {
			ways += makeChange(n - i * denom, next_denom);
		}
		return ways;
	}
}

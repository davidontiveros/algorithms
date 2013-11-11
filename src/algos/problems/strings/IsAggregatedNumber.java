/**
 * 
 */
package algos.problems.strings;

/**
 *we will name a number "aggregated number" if this number has the following attribute: 
 *just like the Fibonacci numbers 
 * 1,1,2,3,5,8,13..... 
 * 
 * the digits in the number can divided into several parts, 
 * and the later part is the sum of the former parts.
 * like 112358, because 1+1=2, 1+2=3, 2+3=5, 3+5=8 
 * 122436, because 12+24=36 
 * 1299111210, because 12+99=111, 99+111=210 
 * 112112224, because 112+112=224  
 * @author daviD_dev
 *
 */
public class IsAggregatedNumber {
	
	public static void main(String[] args) 
	{	
		String str = "1299111210";
		System.out.println(new IsAggregatedNumber().check(str));
	}

	/**
	 * Check each possible solution for each n pairs of numbers.
	 */
	private boolean check(String str)
	{		
		for(int i = 1; i < str.length()/2; i++)
		{
			if(buildSequence(str, i))
				return true;			
		}
		return false;
	}
	
	/**
	 * Build sequence string with n pairs of numbers.
	 */
	private boolean buildSequence(String str, int n)
	{		
		Integer a = Integer.parseInt(str.substring(0,n));
		Integer b = Integer.parseInt(str.substring(n,n*2));	
		Integer result = a+b;				
		String sequence = a.toString() + b.toString() + result.toString();		
		while(sequence.length() < str.length() && str.startsWith(sequence))
		{
			a = b;
			b = result;
			result = a+result;
			sequence += result;			
		}		
		if(sequence.equals(str))
				return true;		
		return false;
	}	
}

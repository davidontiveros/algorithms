package algos.problems;

/**
Write  a  function  to  convert  a  string  into  an  integer.  
This  function  is  called  A to I (or  atoi())  because  we  are  converting  an  ASCII  string  into  an  integer.
**/
public class StringToInteger
{
	public static void main(String args[])
	{
		System.out.println(atoi("-45354"));
	}

	public static int atoi(String string)
	{
		boolean isNegative=Boolean.FALSE;
		int i = 0;
		int output = 0;
		
		if(string.length()==0)
			return 0;
		if(string.charAt(0) == '-')	
		{		
			isNegative=Boolean.TRUE;
			i = 1;
		}		
		for(;i<string.length();i++)
		{
			int n = string.charAt(i) - 48; //ASCII number chars starts from '0' -> #48
			output = (output * 10) + n;
		}		
		return isNegative ? (output*-1) : output ;
	}
}
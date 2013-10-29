package algos.problems;

/*
	80 -> L -> X - > X ->
	
	I = 1	II = 2	III = 3 IV = 4									[1,4]
	V = 5 -> VI = 6 -> VII = 7 -> VIII = 8 IX = 9					[5,9]
	X = 10 -> 	XX = 20 -> 	XXX = 30 -> XL = 40						[10,49]
	L = 50 -> 	LX = 60 -> 	LXX = 70 -> LXXX = 80 -> XC = 90		[50,99]
	C = 100 -> 	CX = 110 -> CXX = 120 -> CXXX = 130	-> CXL = 140 -> CL = 150 ->	CLX = 160 -> CLXX = 170 ->	CLXXX = 180	
																	[100,499]
				D = 500												[500,999]
				M = 1000											[1000, n]
		
*/
/**
 * 
 * @author daviD_dev
 *
 */
public class RomanNumbers
{
	public static void main(String args[])
	{
		Integer input = Integer.parseInt(args[0]);				
		//System.out.println(new RomanNumbers().convertToRoman(input,new String()));
		System.out.println(new RomanNumbers().intToRoman(input,new String()));
	}
	
	public String ones[] = {"I","II","III"};
	
	public String convertToRoman(int n, String output)
	{		
		switch(n)
		{
			case 1000 :	return output +="M";
			case 900 :	return output +="CM";
			case 500 :	return output +="D";
			case 400:	return output +="CD";
			case 100 : 	return output +="C";
			case 90 : 	return output +="XC";
			case 50 :	return output +="L";
			case 40 :	return output +="XL";
			case 10 :	return output +="X";		
			case 9 :	return output +="IX";		
			case 5 :	return output +="V";			
			case 4 :	return output +="IV";
			case 3 :	return output +="III";
			case 2 :	return output +="II";
			case 1 :	return output+= "I" ;
			case 0 : 	return output;
		}
		if(n>=1000)
			return convertToRoman(n-1000, output+="M");	
		else if(n>=900)
			return convertToRoman(n-900, output+= "CM");	
		else if(n>=500)
			return convertToRoman(n-500, output+="D");	
		else if(n>=400)
			return convertToRoman(n-400, output+="CD");	
		else if(n>=100)
			return convertToRoman(n-100, output +="C");
		else if(n>=90)
			return convertToRoman(n-90, output+="XC");		
		else if(n>=50)
			return convertToRoman(n-50, output +="L");	
		else if(n>=40)
			return convertToRoman(n-40, output+="XL");	
		else if(n>=10)
			return convertToRoman(n-10, output +="X");	
		else if(n>=9)
			return convertToRoman(n-9, output+="IX");
		else
			return convertToRoman(n-5, output +="V");
	}
	
	public String intToRoman(int num, String output)
	{
		int arr[] = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
		String symbols[] = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
		for(int i=0;i<arr.length;i++)
		{
			while(num>=arr[i])
			{
				num = num - arr[i];
				output+= symbols[i];	
			}
		}
		return output;
	}


}

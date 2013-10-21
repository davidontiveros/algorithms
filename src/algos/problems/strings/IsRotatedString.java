package algos.problems.strings;

public class IsRotatedString
{
	public static void main(String args[])
	{
		System.out.println(isRotatedString("waterbottle","erbottlewat"));
	}
	
	public static boolean isRotatedString(String s1, String s2)
	{
		s2 = s2+s2;
		System.out.println(s2);	
		if(isSubstring(s2,s1)) 
			return true;
		return false;
	}
	
	public static boolean isSubstring(String s1, String s2)
	{
		return s1.contains(s2);
	}
}
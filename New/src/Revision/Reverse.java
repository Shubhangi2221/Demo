package Revision;

public class Reverse 
{
	public static void main(String[] args)
	{
		String s="Shubh";
		String rev="";
		for(int i=s.length()-1; i>=0; i--)
		{
			rev= rev+s.charAt(i);
		}
		if(s.equals(rev))
		{
			System.out.println(" is palindrome");
		}
		else
		{
			System.out.println(" string is not palindrome");
		}
	}

}

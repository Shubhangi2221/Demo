package Odd;

public class Palindrome 
{
	public static void main(String[] args)
	{
		String s="SGGS";
		String rev="";
		for(int i=s.length()-1; i>=0; i--)
		{
			rev= rev+s.charAt(i);
		}
		if(s.equals(rev))
		{
			System.out.println(" string is reverse");
		}
		else
		{
			System.out.println(" String is not reverse");
		}
	}
		
}

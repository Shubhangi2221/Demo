package Revision;

import java.util.Arrays;

public class Sec_Highest 
{
	public static void main(String[] args)
	{
		int[] a= new int[] {1,2,3,4,5,6};
		Arrays.sort(a);
		int max=a[a.length-2];
		System.out.println(max);
	}

}

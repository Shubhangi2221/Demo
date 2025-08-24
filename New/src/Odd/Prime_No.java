package Odd;

public class Prime_No 
{
	public static void main(String[] args)
	{
		//int no=10;
		//int count=0;
		for(int j=2; j<10; j++)
		{
			int count=0;
			for(int i=2; i<j; i++)
			{
				if(j%i==0)
				{
					count++;
				}
			}
			if(count==0)
			{
				System.out.println(j);
			}
			
		}
	}

}

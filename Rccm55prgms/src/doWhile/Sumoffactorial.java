package doWhile;

public class Sumoffactorial {
	public static void main(String[] args)
	{
		int no=145;
		int copy=no;
		int sum=0;
		do
		{
			int rem=no%10;
			int fact=1;
			for(int j=rem;j>=1;j--)
			{
				fact=fact*j;
			}
			sum=sum+fact;
			no=no/10;
		}
		while(no!=0);
		if(sum==copy)
		{
			System.out.println(copy + " number is strong ");
		}
		else
		{
			System.out.println(copy + " number is not strong ");
		}
	}

}

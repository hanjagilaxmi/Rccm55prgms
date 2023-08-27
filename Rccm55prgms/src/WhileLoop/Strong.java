package WhileLoop;

public class Strong {
	public static void main(String[] args)
	{
		int no=145;
		int sum=0;
		int copy=no;
		while(no!=0)
		{
			int rem=no%10;
			int fact=1;
			int i=rem;
			while(i>=1)
			{
				fact=fact*i;
				i--;
			}
			sum=sum+fact;
			no=no/10;
		}
		if(sum==copy)
		{
			System.out.println("Given number is Strong");
		}
		else
		{
			System.out.println("Given number is not Strong");
		}
	}
}

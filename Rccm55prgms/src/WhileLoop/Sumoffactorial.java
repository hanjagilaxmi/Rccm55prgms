package WhileLoop;

public class Sumoffactorial {
	public static void main(String[] args)
	{
		int no=145;
		int sum=0;
		//int copy=no;
		while(no!=0)
		{
			int rem=no%10;
			int fact=1;
			for(int i=rem;i>=1;i--)
			{
				fact=fact*i;
			}
			sum=sum+fact;
			no=no/10;
		}
		System.out.println(sum);
		//if(sum==copy)
		//{
			//System.out.println("Given number is Strong");
		//}
		//else
		//{
			//System.out.println("Given number is not Strong");
		//}
	}
}

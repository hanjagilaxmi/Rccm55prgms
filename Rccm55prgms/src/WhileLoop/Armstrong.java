package WhileLoop;

public class Armstrong {
	public static void main(String[] args)
	{
		int no=256;
		int sum=0;
		int copy=no;
		while(no!=0)
		{
			int rem=no%10;
			sum=sum+(rem*rem*rem);
			no=no/10;
		}
		if(sum==copy)
		{
			System.out.println("Given number is Armstrong");
		}
		else
		{
			System.out.println("Given number is not Armstrong");
		}
	}
}

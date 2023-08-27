package ForLoop;

public class Strongnumber {
	public static void main(String[] args) {
		int sum=0;
		int copy=145;
		for(int no=145;no!=0;)
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
		if(copy==sum)
		{
			System.out.println("Given number is Strong");
		}
		else
		{
			System.out.println("Given number is not Strong");
		}
	}
}

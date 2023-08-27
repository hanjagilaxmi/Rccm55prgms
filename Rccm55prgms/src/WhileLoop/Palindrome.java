package WhileLoop;

public class Palindrome {
	public static void main(String[] args)
	{
		int no=454;
		int sum=0;
		int copy=no;
		while(no!=0)
		{
			int rem=no%10;
			sum=(sum*10)+(rem);
			no=no/10;
		}
		if(sum==copy)
		{
			System.out.println("Given number is Palindrome");
		}
		else
		{
			System.out.println("Given number is not Palindrome");
		}
	}
}

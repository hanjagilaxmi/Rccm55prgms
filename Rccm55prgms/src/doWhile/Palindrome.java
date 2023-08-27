package doWhile;

public class Palindrome {
	public static void main(String[] args)
	{
		int no=676;
		int sum=0;
		int copy=no;
		do
		{
			int rem=no%10;
			sum=(sum*10)+rem;
			no=no/10;
		}
		while(no!=0);
		if(sum==copy)
		{
			System.out.println(copy+" number is Palindrome");
		}
		else
		{
			System.out.println(copy+" number is not Palindrome");
		}
	}
}

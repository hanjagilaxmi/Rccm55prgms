package ForLoop;

public class Palindromenumber {
	public static void main(String[] args) {
		int sum=0;
		int copy=243;
		for(int no=243;no!=0;)
		{
			int rem=no%10;
			sum=(sum*10)+rem;
			no=no/10;
		}
		if(copy==sum)
		{
			System.out.println("Given number is Palindrome");
		}
		else
		{
			System.out.println("Given number is not Palindrome");
		}
	}
}

package doWhile;

public class Reversenumber {
	public static void main(String[] args)
	{
		int no=2876;
		int rev=0;
		do
		{
			int rem=no%10;
			rev=(rev*10)+rem;
			no=no/10;
		}
		while(no!=0);
		System.out.println(rev);
	}
}

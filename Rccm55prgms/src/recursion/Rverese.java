package recursion;

public class Rverese {
	static int rev=0;
	static void num(int no)
	{
		if(no!=0)
		{
			int rem=no%10;
			rev=(rev*10)+rem;
			no=no/10;
			num(no);	
		}	
	}
	public static void main(String[] args)
	{
		num(345);
		System.out.println(rev);	
	}
}

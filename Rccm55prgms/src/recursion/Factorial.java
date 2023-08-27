package recursion;

public class Factorial {
	static int fact=1;
	static void facto(int i)
	{
		if(i>=1)
		{
			fact=fact*i;
			i--;
			facto(i);
		}
		
	}
	public static void main(String[] args)
	{
		facto(5);
		System.out.println(fact);
	}
}

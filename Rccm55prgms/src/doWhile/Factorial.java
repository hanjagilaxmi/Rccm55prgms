package doWhile;

public class Factorial {
	public static void main(String[] args)
	{
		int fact=1;
		int no=5;
		int i=no;
		do
		{
			fact=fact*i;
			i--;
		}
		while(i>=1);
		System.out.println(fact);
	}
}

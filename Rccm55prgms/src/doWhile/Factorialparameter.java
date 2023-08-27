package doWhile;

public class Factorialparameter {
	static void facto(int no)
	{
		int fact=1;
		int i=no;
		do 
		{
			fact=fact*i;
			i--;
		}
		while(i>=1);
		System.out.println(fact);
	}
	public static void main(String[] args)
	{
		facto(6);
	}
}

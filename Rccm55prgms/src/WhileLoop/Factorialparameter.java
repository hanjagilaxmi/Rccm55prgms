package WhileLoop;

public class Factorialparameter {
	static void fact(int no)
	{
		int i=no;
		int fact=1;
		while(i>=1)
		{
			fact=fact*i;
			i--;
		}
		System.out.println(fact);
	}
	public static void main(String[] args)
	{
		fact(5);
	}

}

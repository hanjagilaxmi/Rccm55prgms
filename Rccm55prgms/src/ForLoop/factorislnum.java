package ForLoop;

public class factorislnum {
	static void number(int no)
	{
		int fact=1;
		for(int i=no;i>=1;i--)
		{
			fact=fact*i;
		}
		System.out.println(fact);
	}
	public static void main(String[] args)
	{
		number(7);
	}

}

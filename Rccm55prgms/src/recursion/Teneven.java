package recursion;

public class Teneven {
	static void num(int a)
	{
		if(a>=1)
		{
			if(a%2==0)
			System.out.println(a);
			a--;
			num(a);
		}
	}
	public static void main(String[] args)
	{
		num(10);
	}
}

package recursion;

public class Heelojava {
	static void num(int a)
	{
		if(a<=5)
		{
			System.out.println("Hello java");
			a++;
			num(a);
		}
	}
	public static void main(String[] args)
	{
		num(1);
	}
}

package ForLoop;

public class Oddtables {
	static void tab(int no)
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(no+ " * "  + i + " = " + (no*i));
		}
	}
	public static void main(String[] args)
	{
		for(int j=1;j<=100;j++)
		{
			if(j%2==1)
				tab(j);
				System.out.println();
		}
	}


}

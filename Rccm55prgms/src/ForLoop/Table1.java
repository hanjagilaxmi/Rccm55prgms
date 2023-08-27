package ForLoop;

public class Table1 {
	static void tab(int no)
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(no+ " * "  + i + " = " + (no*i));
		}
	}
	public static void main(String[] args)
	{
		tab(3);
		System.out.println();
		tab(5);
		System.out.println();
		
	}

}

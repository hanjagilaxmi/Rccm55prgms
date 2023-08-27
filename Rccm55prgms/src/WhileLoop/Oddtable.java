package WhileLoop;

public class Oddtable {
	static void tab(int no)
	{
		int i=1;
		while(i<=10)
		{
			System.out.println(no+" * "+i+" = "+(no*i));
			i++;
		}
	}
	public static void main(String[] args)
	{
		int j=1;
		while(j<=100)
		{
			if(j%2==1)
			tab(j);
			System.out.println();
			j++;
		}
	}
}

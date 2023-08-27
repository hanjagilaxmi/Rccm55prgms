package doWhile;

public class Table100 {
	static void tab(int no)
	{
		int i=1;
		do {
			System.out.println(no+" * "+i+" = "+(no*i));
			i++;
		}
		while(i<=10);
	}
	public static void main(String[] args)
	{
		int j=1;
		do
		{
		tab(j);
		System.out.println();
		j++;
		}
		while(j<=100);
	}
}

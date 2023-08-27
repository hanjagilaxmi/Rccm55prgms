package doWhile;

public class Tables {
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
		tab(3);
		System.out.println();
		tab(5);
		System.out.println();
	}
}

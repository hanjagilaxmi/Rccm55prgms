package doWhile;

public class NUM {
	static void tab(int i)
	{
		do {
			System.out.println(i);
			i=i+1;
		}
		while(i<=10);

	}
	public static void main(String[] args)
	{
		tab(1);
	}
}

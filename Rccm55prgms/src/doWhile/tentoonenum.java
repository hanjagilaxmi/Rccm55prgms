package doWhile;

public class tentoonenum {
	static void tab(int i)
	{
		do {
			System.out.println(i);
			i=i-1;
		}
		while(i>=1);

	}
	public static void main(String[] args)
	{
		tab(10);
	}
}

package ForLoop;

public class Countdigits {
	static void prgm(int no)
	{
		int count=0;
		for(int i=no;no!=0;)
		{
			int rem=no%10;
			count++;
			no=no/10;
		}
		System.out.println(count);
	}
	public static void main(String[] args)
	{
		prgm(345);
	}
}

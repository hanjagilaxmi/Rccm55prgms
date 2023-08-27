package doWhile;

public class Countofdigitparameter {
	static void digit(int no)
	{
		int count=0;
		do
		{
			int rem=no%10;
			count++;
			no=no/10;
		}
		while(no!=0);
		System.out.println(count);
	}
	public static void main(String[] args)
	{
		digit(3807);
	}
}

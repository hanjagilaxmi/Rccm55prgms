package doWhile;

public class Countofdigits {
	public static void main(String[] args)
	{
		int no=345;
		int count=0;
		do {
			
			int rem=no%10;
			count++;
			no=no/10;
		}
		while(no!=0);
		System.out.println(count);
	}
}

package doWhile;

public class Countofevendigits {
	public static void main(String[] args)
	{
		int no=3456;
		int count=0;
		do {
			
			int rem=no%10;
			if(rem%2==0)
			count++;
			no=no/10;
		}
		while(no!=0);
		System.out.println(count);
	}
}

package doWhile;

public class Sumofevendigits {
	public static void main(String[] args)
	{
		int no=3456;
		int sum=0;
		do {
			
			int rem=no%10;
			if(rem%2==0)
			sum=sum+rem;
			no=no/10;
		}
		while(no!=0);
		System.out.println(sum);
	}
}

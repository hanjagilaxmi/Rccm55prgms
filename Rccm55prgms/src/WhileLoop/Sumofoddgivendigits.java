package WhileLoop;

public class Sumofoddgivendigits {
	static void digit(int no)
	{
		int sum=0;
		while(no!=0)
		{
			int rem=no%10;
			if(rem%2==1)
			sum=sum+rem;
			no=no/10;
		}
		System.out.println(sum);
	}
	public static void main(String[] args)
	{
		digit(45673);
	}
}

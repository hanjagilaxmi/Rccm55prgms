package WhileLoop;

public class Sumofsquareofodd {
	public static void main(String[] args)
	{
		int no=3521;
		int sum=0;
		while(no!=0)
		{
			int rem=no%10;
			if(rem%2==1)
			sum=sum+(rem*rem);
			no=no/10;
		}
		System.out.println(sum);
	}
}

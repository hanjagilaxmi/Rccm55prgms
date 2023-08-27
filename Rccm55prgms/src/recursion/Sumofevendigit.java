package recursion;

public class Sumofevendigit {
	static int sum=0;
	static void num(int no)
	{
		if(no!=0)
		{
			int rem=no%10;
			if(rem%2==0)
			sum=sum+rem;
			no=no/10;
			num(no);
			
		}	
	}
	public static void main(String[] args)
	{
		num(345);
		System.out.println(sum);	
	}
}

package recursion;

public class Strong {
	static int sum=0;
	static void num(int no)
	{
		if(no!=0)
		{
			int rem=no%10;
			sum=sum+(rem*rem);
			no=no/10;
			num(no);
		}	
		
		
	}
	public static void main(String[] args)
	{
		num(153);
		System.out.println(sum);
	}
}

package recursion;

public class Armstrong {
	static int sum=0;
	static int copy;
	static int no;
	static void num(int no)
	{
		if(no!=0)
		{
			int rem=no%10;
			sum=sum+(rem*rem*rem);
			no=no/10;
			num(no);
		}	
	}
	public static void main(String[] args)
	{
		no=153;
		copy=no;
		num(153);
		if(sum==copy)
		{
			System.out.println("Armstrong number");
		}
		else
		{
			System.out.println(" not Armstrong number");
		}
	}
}

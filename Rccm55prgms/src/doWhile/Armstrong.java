package doWhile;

public class Armstrong {
	public static void main(String[] args)
	{
		int no=345;
		int sum=0;
		int copy=no;
		do {
			
			int rem=no%10;
			sum=sum+(rem*rem*rem);
			no=no/10;
		}
		while(no!=0);
		if(sum==copy)
		{
			System.out.println(copy + " number is Armstrong ");
		}
		else
		{
			System.out.println(copy + " number is not Armstrong ");
		}
	}
}

package ForLoop;

public class Armstrong {
	public static void main(String[] args) {
		int sum=0;
		int copy=153;
		for(int no=153;no!=0;)
		{
			int rem=no%10;
			sum=sum+(rem*rem*rem);
			no=no/10;
		}
		if(copy==sum)
		{
			System.out.println("Given number is Armstrong");
		}
		else
		{
			System.out.println("Given number is not Armstrong");
		}
	}
}

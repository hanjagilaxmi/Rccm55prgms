package ForLoop;

public class Sumofodddigits {
	public static void main(String[] args) {
		int sum=0;
		for(int no=432;no!=0;)
		{
			int rem=no%10;
			if(rem%2==1)
			{
			sum=sum+rem;
			}
			no=no/10;
		}
		System.out.println(sum);
	}
}

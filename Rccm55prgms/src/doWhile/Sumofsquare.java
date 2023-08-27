package doWhile;

public class Sumofsquare {
	public static void main(String[] args)
	{
		int no=345;
		int sum=0;
		do {
			
			int rem=no%10;
			sum=sum+(rem*rem);
			no=no/10;
		}
		while(no!=0);
		System.out.println(sum);
	}
}

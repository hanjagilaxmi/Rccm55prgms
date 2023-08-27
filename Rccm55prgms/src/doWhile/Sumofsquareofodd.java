package doWhile;

public class Sumofsquareofodd {
	public static void main(String[] args)
	{
		int no=3451;
		int sum=0;
		do {
			
			int rem=no%10;
			if(rem%2==1)
			sum=sum+(rem*rem);
			no=no/10;
		}
		while(no!=0);
		System.out.println(sum);
	}
}

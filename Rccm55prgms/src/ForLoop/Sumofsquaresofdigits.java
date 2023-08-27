package ForLoop;

public class Sumofsquaresofdigits {
	public static void main(String[] args) {
		int sum=0;
		for(int no=432;no!=0;)
		{
			int rem=no%10;
			sum=sum+(rem*rem);
			no=no/10;
		}
		System.out.println(sum);
	}
}

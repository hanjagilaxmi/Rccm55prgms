package ForLoop;

public class Reversenumber {
	public static void main(String[] args) {
		int rev=0;
		for(int no=432;no!=0;)
		{
			int rem=no%10;
			rev=(rev*10)+rem;
			no=no/10;
		}
		System.out.println(rev);
	}

}

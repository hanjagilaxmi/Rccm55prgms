package ForLoop;

public class Countofodddigits {
	public static void main(String[] args) {
		int count=0;
		for(int no=432537;no!=0;)
		{
			int rem=no%10;
			if(rem%2==1) 
			count++;
			no=no/10;
		}
		System.out.println(count);
	}
}

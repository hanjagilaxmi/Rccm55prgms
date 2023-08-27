package ForLoop;

public class Countofevendigits {
	public static void main(String[] args) {
		int count=0;
		for(int no=432;no!=0;)
		{
			int rem=no%10;
			if(rem%2==0) {
			count++;
			}
			no=no/10;
		}
		System.out.println(count);

	}
}

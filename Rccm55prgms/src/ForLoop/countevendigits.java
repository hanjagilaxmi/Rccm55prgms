package ForLoop;

public class countevendigits {
	static void prgm(int no)
	{
		int count=0;
		for(int i=no;no!=0;)
		{
			int rem=no%10;
			if(rem%2==0)
			count++;
			no=no/10;
		}
		System.out.println(count);
	}
	public static void main(String[] args)
	{
		prgm(3456832);
	}

}

package recursion;

public class Countofdigit {
	static int count=0;
	static void num(int no)
	{
		if(no!=0)
		{
			int rem=no%10;
			count++;
			no=no/10;
			num(no);
			
		}	
	}
	public static void main(String[] args)
	{
		num(345);
		System.out.println(count);	
	}

}

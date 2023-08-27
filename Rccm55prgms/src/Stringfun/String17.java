package Stringfun;

public class String17 {
	public static void main(String[] args)
	{
		String s="GADAG";
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		if(s.equals(rev))
		{
			System.out.println(rev+" String is Palindrome ");
		}
		else
		{
			System.out.println(rev+" String is not Palindrome ");
		}
	}
}

package Stringfun;

public class String19 {
	public static void main(String[] args)
	{
		String s="My name is Laxmi";
		String[] abc=s.split(" ");
		String s1=abc[3];
		String rev=" ";
		for (int i=s1.length()-1;i>=0;i--)
		{
			rev=rev+s1.charAt(i);
		}
		abc[3]=rev;
		for(int j=abc.length-1;j>=0;j--)
		{
			System.out.print(abc[j]+" ");
		}
	}
}

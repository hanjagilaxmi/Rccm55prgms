package Stringfun;

public record String18() {
	public static void main(String[] args)
	{
		String s="Laxmi is beautiful";
		String[] abc=s.split(" ");
		for(int i=abc.length-1;i>=0;i--)
		{
			System.out.print(abc[i]+" ");
		}
	}
}

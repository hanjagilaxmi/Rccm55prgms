package doWhile;

public class Sampleouput {
	public static void main(String[] args)
	{
		for(int i=1;i<=5;i++)
		{
		if(i==3||i==5)
		{
			int j=1;
			do
			{
				System.out.print(i+" ");
				j++;
			}
			while(j<=3);
		}
		else
		{
			System.out.print(i+" ");
		}
		}
	}
}

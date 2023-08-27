package ForLoop;

public class Sampleoutput {
	public static void main(String[] args)
	{
		for(int i=1;i<=5;i++)
		{
			if(i==3||i==5)
			{
				for(int j=1;j<=3;j++)
				{
					System.out.print(i+" ");
				}
			}
			else
			{
				System.out.print(i+" ");
			}
		}
	}

}

package doWhile;

public class Tabledo {
	public static void main(String[] args)
	{
		int j=1;
		int no=j;
		do
		{
			System.out.println();
			if(j%2==0)
			for(int i=1;i<=10;i++)
			{
				System.out.println(no+" * "+i+" = "+(no*i));	
			}
			j++;
			no++;
		}
		while(j<=100);
		
		
	}
}

package recursion;

public class tableeven {
	static void tab(int no,int i)
	{	
		if(i<=10)
		{
			System.out.println(no+" * "+i+" = "+(no*i));
			i++;
			tab(no,i);
		}
		
	}
	public static void main(String[] args)
	{
		int i=1;
		int j=1;
		while(j<=100)
		{
			if(j%2==0)
			tab(j,i);
			System.out.println();
			j++;
		}
	}

}

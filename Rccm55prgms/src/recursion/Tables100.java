package recursion;

public class Tables100 {
	
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
			tab(j,i);
			System.out.println();
			j++;
		}
	}
}

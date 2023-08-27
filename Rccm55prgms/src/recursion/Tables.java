package recursion;

public class Tables {

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
		tab(3,1);
		System.out.println();
	}
}

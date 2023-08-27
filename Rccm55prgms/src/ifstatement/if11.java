package ifstatement;

public class if11 {
	static void prgm(int a)
	{
		if(a>=1)
		{
			System.out.println(a);
			a--;
			prgm(a);
		}
	}
	public static void main(String[] args)
	{
		prgm(10);
	
	}
}

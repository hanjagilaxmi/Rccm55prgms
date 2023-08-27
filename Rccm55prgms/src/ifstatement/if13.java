package ifstatement;

public class if13 {
	static void prgm(int a)
	{
		if(a>=1)
		{
			if(a%2==1)
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

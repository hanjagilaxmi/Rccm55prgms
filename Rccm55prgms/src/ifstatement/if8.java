package ifstatement;

public class if8 {
	static void prgm(int a)
	{
		if(a<=10)
		{
			System.out.println(a);
			a++;
			prgm(a);
		}
	}
	public static void main(String[] args)
	{
		prgm(1);
	
	}

}

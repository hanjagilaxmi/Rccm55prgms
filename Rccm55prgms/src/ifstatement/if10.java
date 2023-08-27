package ifstatement;

public class if10 {
	static void prgm(int a)
	{
		if(a<=10)
		{
			if(a%2!=0)
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

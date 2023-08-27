package doWhile;

public class Tableeven {
	static void tab(int no)
	{
		int i=1;
		do {
			System.out.println(no+" * "+i+" = "+(no*i));
			i++;
		}
		while(i<=10);
	}
	public static void main(String[] args)
	{
		int j=1;
		do
		{
			if(j%2==0)
		tab(j);
		System.out.println();
		j++;
		}
		while(j<=100);
	}
}

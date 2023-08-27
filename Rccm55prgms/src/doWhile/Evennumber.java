package doWhile;

public class Evennumber {
	static void tab(int i)
	{
		do {
			if(i%2==0)
			System.out.println(i);
			i=i+1;
		}
		while(i<=10);

	}
	public static void main(String[] args)
	{
		tab(1);
	}
}

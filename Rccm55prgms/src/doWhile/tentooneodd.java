package doWhile;

public class tentooneodd {
	static void tab(int i)
	{
		do {
			if(i%2==1)
			System.out.println(i);
			i=i-1;
		}
		while(i>=1);

	}
	public static void main(String[] args)
	{
		tab(10);
	}
}

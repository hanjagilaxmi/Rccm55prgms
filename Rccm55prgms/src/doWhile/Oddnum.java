package doWhile;

public class Oddnum {
	public static void main(String[] args)
	{
		int i=1;
		do {
			if(i%2==1)
			System.out.println(i);
			i=i+1;
		}
		while(i<=10);
	}
}

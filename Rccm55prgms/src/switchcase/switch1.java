package switchcase;

public class switch1 {
	public static void main(String[] args)
	{
		char ch='A';
		switch(ch)
		{
		case 'B':System.out.println("2nd class");
		break;
		case 'C':System.out.println("just class");
		break;
		case 'A':System.out.println("1st class");
		break;
		default:System.out.println("Invalid Grade");
		}
	}
}

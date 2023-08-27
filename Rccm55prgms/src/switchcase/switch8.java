package switchcase;

public class switch8 {
	public static void main(String[] args)
	{
		char branch='D';
		switch(branch)
		{
		case 'A':System.out.println("Maths,English");
		break;
		case 'E':System.out.println("C,C++");
		break;
		case 'D':System.out.println("Java,DB");
		break;
		case 'M':System.out.println("Mongodb,Python");
		break;
		case 'U':System.out.println("AI,ML");
		break;
		default:System.out.println("Invalid");
		}
	}

}

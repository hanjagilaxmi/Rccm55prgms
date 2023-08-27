package switchcase;

public class switch9 {
	public static void main(String[] args)
	{
		int age=18;
		switch(age)
		{
		case 10:System.out.println("You are under 18");
		break;
		case 18:System.out.println("Eligible to vote");
		break;
		case 65:System.out.println("You are senior citizen");
		break;
		default:System.out.println("Invalid");
		}
	}
}

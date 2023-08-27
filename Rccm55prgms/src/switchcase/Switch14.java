package switchcase;

public class Switch14 {
	public static void main(String[] args)
	{
		String degree="completed";
		switch(degree)
		{
		case "2ndyear":System.out.println("not eligible for CSE");
		break;
		case "3ndyear":System.out.println("not eligible for CSE");
		break;
		case "4ndyear":System.out.println("Should be in 8th sem");
		break;
		case "completed":System.out.println("eligible for CSE");
		break;
		default:System.out.println("Invalid");
		}
	}
}

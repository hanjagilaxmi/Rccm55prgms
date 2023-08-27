package switchcase;

public class Switch12 {
	public static void main(String[] args)
	{
		int marks=60;
		switch(marks)
		{
		case 35:System.out.println("Pass");
		break;
		case 60:System.out.println("Second Class");
		break;
		case 70:System.out.println("First Class");
		break;
		case 85:System.out.println("Distinction");
		break;
		default:System.out.println("Fail");
		}
	}
}

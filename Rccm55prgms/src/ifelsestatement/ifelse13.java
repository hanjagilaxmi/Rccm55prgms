package ifelsestatement;

public class ifelse13 {
	public static void main(String[] args)
	{
		int mob_price=2000;
		String mob_brand="IQ";
		if(mob_price<=2000||mob_brand=="MI")
		{
			System.out.println("Should display all mobiles under 20K");
		}
		else
		{
			System.out.println("Error message");
		}
	}

}

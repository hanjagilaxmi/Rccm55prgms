package Arrays;

public class array12 {
	public static void main(String[] args)
	{
		int abc[]= {26,13,45,67};
		int smallest=abc[0];
		for(int i=0;i<=abc.length-1;i++)
		{
			if(abc[i]<smallest)
				smallest=abc[i];
		}
		System.out.println(smallest);
	}
}

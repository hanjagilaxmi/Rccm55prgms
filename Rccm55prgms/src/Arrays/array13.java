package Arrays;

public class array13 {
	public static void main(String[] args)
	{
		int abc[]= {26,13,45,67};
		int largest=0;
		int smallest=abc[0];
		for(int i=0;i<=abc.length-1;i++)
		{
			if(abc[i]>largest)
			{
				largest=abc[i];
			}
			else if(abc[i]<smallest)
			{
			smallest=abc[i];
			}		
		}
		System.out.println(largest);
		System.out.println(smallest);
	}
}

package Arrays;

public class array29 {
	public static void main(String[] args)
	{
		int abc[]=new int[4];
		abc[0]=23;
		abc[1]=26;
		abc[2]=76;
		abc[3]=89;
		int largest=abc[0];
		int smallest=abc[0];
		for(int i=0;i<=abc.length-1;i++)
		{
			if(abc[i]>largest)
				largest=abc[i];
			else if(abc[i]<smallest)
			{
				smallest=abc[i];
			}
		}
		System.out.println(smallest);
		System.out.println(largest);
	}
}

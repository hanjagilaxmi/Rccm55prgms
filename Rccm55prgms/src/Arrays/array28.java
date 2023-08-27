package Arrays;

public class array28 {
	public static void main(String[] args)
	{
		int abc[]=new int[4];
		abc[0]=23;
		abc[1]=26;
		abc[2]=76;
		abc[3]=89;
		int smallest=abc[0];
		for(int i=0;i<=abc.length-1;i++)
		{
			if(abc[i]<smallest)
			{
				smallest=abc[i];
			}
		}
		System.out.println(smallest);
	}
}

package Arrays;

public class array21 {
	public static void main(String[] args)
	{
		int abc[]=new int[4];
		abc[0]=23;
		abc[1]=26;
		abc[2]=76;
		abc[3]=89;
		
		for(int i=0;i<=abc.length-1;i++)
		{
			if(i%2==0)
			System.out.println(abc[i]);
		}
		
	}
}

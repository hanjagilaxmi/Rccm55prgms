package Arrays;

public class array18 {
	public static void main(String[] args)
	{
		int abc[]=new int[4];
		abc[0]=23;
		abc[1]=26;
		abc[2]=76;
		abc[3]=89;
		
		for(int i=0;i<=abc.length-1;i++)
		{
			if(abc[i]%2==1)
			System.out.println(abc[i]);
		}
		
	}
}

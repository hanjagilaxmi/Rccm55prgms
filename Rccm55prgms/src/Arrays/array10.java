package Arrays;

public class array10 {
	public static void main(String[] args)
	{
		int abc[]= {26,13,45,67};
		int sum=0;
		for(int i=0;i<=abc.length-1;i++)
		{
			if(abc[i]%2==1)
			sum=sum+abc[i];
		}
		System.out.println(sum);
	}
}

package Arrays;

public class array15 {
	public static void main(String[] args)
	{
		int[] abc= {25,78,54,23,98};
		int sum=0;int avg=0;
		for(int i=0;i<abc.length;i++) {
			sum=sum+abc[i];
		}
		avg=sum/abc.length;
		System.out.println(avg);
	}
}

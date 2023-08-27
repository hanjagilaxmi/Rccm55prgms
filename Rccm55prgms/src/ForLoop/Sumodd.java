package ForLoop;

public class Sumodd {
	static void prgm(int no){
		int sum=0;
		for(int i=no;no!=0;)
		{
			int rem=no%10;
			if(rem%2==1)
			sum=sum+rem;
			no=no/10;
		}
		System.out.println(sum);
	}
	 public static void main(String[] args) {
		 prgm(45673);
	 }
}

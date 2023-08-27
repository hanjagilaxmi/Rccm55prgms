package programming;

class Singletonea {
		static int count=0;
		static Singletonea s;
		int x=10;
		private Singletonea()
		{
			count++;
		}
		public static Singletonea getInstance()
		{
			if(count<1)
			{
				s=new Singletonea();
			}
			return s;
		}
		public static void setInstance(int y)
		{
			s.x=y;
		}
	}
public class Singletone {
	
		public static void main(String[] args) {
			Singletonea a=Singletonea.getInstance();
			System.out.println(a.x);
			Singletonea b=Singletonea.getInstance();
			System.out.println(b.x);
			Singletonea c=Singletonea.getInstance();
			System.out.println(c.x);
	}
}

package recursion;

public class Fibonacci {
	static int f1=0;
	static int f2=1;
	static int f3=0;      
    static void Fibo(int no){      
       if(no>=1){      
            f3 = f1 + f2;      
            f1 = f2;      
            f2 = f3;      
            System.out.print(" "+f3);
            no--;
            Fibo(no);      
        }      
    }        
 
public static void main(String[] args) {      
     System.out.print(f1+" "+f2); 
     Fibo(5);
}  
}

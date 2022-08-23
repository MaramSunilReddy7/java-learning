package while_loop;
import java.util.Scanner;
public class PrimeNumOrNot {  // prime number is a number that is  divided by 1 and n(itself)

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
	       int n = s.nextInt();
	       int d=2;
	       while(d <=n-1)
	       {
	    	   if (n%d ==0)
	    	   {
	    		   System.out.println("Not prime ");   // some number(d) is dividing the n,, so it is not a prime number
	    		   return;    // stop the process , becase it is declared as not prime
	    	   }
	    	   d = d+1;  // we are incrementing the d, if d is not divisible by n
	       }
	       System.out.println("Prime Number");   	   
	}

}

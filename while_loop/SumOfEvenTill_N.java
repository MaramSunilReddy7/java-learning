package while_loop;
import java.util.Scanner;

public class SumOfEvenTill_N {

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
	       int n = s.nextInt();
	       int Sum = 0;
	       while (n > 1)
	       {
	    	   if (n%2 ==0)   // if n is even
	    	   {
	    		   Sum = Sum+n;
	    		   n = n-2;
	    	   }
	    	   else
	    	   {
	    		   Sum = Sum+n-1; // if n is odd
	    		   n= n-2;
	    	   }
	       }
	       System.out.println(Sum);
	       
	}

}

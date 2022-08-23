package while_loop;
import java.util.Scanner;

public class SumOfEvenTillN {

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
	       int n = s.nextInt();
	       int Sum = 0;
	       int i = 0;
	       while (i<=n)
	       {
	    	   Sum = Sum + 2;
	    	   i = i + 2;
	       }
	       System.out.println(Sum);
	}

}

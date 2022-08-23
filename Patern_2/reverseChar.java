package patterns_lecture5;

import java.util.Scanner;

public class reverseChar {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	       int n = s.nextInt();
	       int i = 1;
	       while (i<=n) {
	    	   int j =1;
	    	   int val = n;
	    	   while (j<=i) {
	    		   char jthchar = (char)('A'+val-1);
	    		   System.out.print(jthchar);
	    		   val = val -1;
	    		   j = j +1;
	    	   }
	    	   System.out.println();
	    	   i = i + 1;
	       }
	}

}

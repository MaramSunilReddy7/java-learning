package patterns_lecture6;

import java.util.Scanner;

public class pattern6 {

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
	        int n = s.nextInt();
	        
	        
	        int n1 = (n+1)/2;
	        int n2 = n1-1;
	      //top part
	        int i = 1;
	        while (i<=n1) {
	        	//spaces
	        	int space = 1;
	        	while (space<=n1-i) {
	        		System.out.print(" ");
	        		space = space + 1;
	        	}
	        	//printing stars
	        	int j = 1;
	        	while (j<= 2*i-1) {
	        		System.out.print("*");
	        		j  = j + 1;
	        	}
	        	System.out.println();
	        	i = i + 1;
	        }
	        
	        //bottom part
	        
	        int k = n2;
	        while (k>=1) {
	        	//spaces
	        	int space =1;
	        	while (space<=n2-k+1) {
	        	System.out.print(" ");
	        	space = space +1;
	        }
	        	//printing stars
	        	int l =1;
	        	while (l<=(2*k)-1) {
	        		System.out.print("*");
	        		l = l +1;
	        	}
	        	System.out.println();
	        	k= k-1;
	}

   }
}

package arrays;

import java.util.Scanner;

public class ArrangeNum {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	      int n = s.nextInt();
	      
	      int x = 1;
	      int arr[] = new int[n]; //array created
	      for(int i = 0;i<=(n-1)/2;i++) {
	    	  arr[i] = x;
	    	  x +=2;
	    	  System.out.print(arr[i] + " ");
	      }
	      if (n%2 == 0) {
	    	  int y = n;
	    	  for(int j = ((n-1)/2 +1) ; j<n; j++) {
	    		  arr[j] = y;
	    		  y -= 2;
	    		  System.out.print(arr[j] + " ");
	    	  }
	      }else {
	    	  int y = n-1;
	    	  for (int j = ((n-1)/2 + 1); j<n; j++) {
	    		  arr[j] = y;
	    		  y -=2;
	    		  System.out.print(arr[j] + " ");
	    	  }
	      }
	}

}

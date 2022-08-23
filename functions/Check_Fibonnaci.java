package functions;

import java.util.Scanner;

public class Check_Fibonnaci {

	public static boolean FactCheck(int n) {
       int a = 0;
       int b = 1;
       int c,i;
       boolean isFactorial = false;
       for (i=0;i<=n;i++) {
    	   c = a + b;
    	   a=b;
    	   b=c;
    	   if(c==n) {
    		   isFactorial = true;
    		  break;
    	   }
       }if(isFactorial) {
    	   return true;
		}else {
			return false;	
		}
	}
	public static void main(String[] args) {
	       Scanner s = new Scanner(System.in);
	       int n = s.nextInt();
	}

}

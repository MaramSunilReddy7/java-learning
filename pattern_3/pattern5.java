package patterns_lecture6;

import java.util.Scanner;

public class pattern5 {

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
	        int n = s.nextInt();
	        int i = 1;
	        while (i<=n) {
	        	//spaces
	        	int space = 1;
	        	while(space<= n-i) {
	        		System.out.print(" ");
	        		space = space+1;
	        	}
	        	//increasing part
	        	int j = 1;
	        	int val = i;
	        	while(j<=i) {
	        		System.out.print(val);
	        		val = val+1;
	        		j = j + 1;
	        	}
	        	//decreasing part
	        	int dec = 2*i - 2;
	        			while(dec>=i) {
	        				System.out.print(dec);
	        				dec = dec -1;
	        			}
	        	System.out.println();
	        	i = i + 1;
	        }
	}

}

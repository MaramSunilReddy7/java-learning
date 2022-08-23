package patterns_lecture6;

import java.util.Scanner;

public class pattern3 {

	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;
        while (i<=n) {
        	//stars
        	int j = 1;
        	while (j<=n-i+1) {
        		System.out.print("*");
        		j = j + 1;
        	}
        	System.out.println();
        	i = i + 1;
        }
	}

}

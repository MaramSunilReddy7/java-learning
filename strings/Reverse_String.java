package Strings;

import java.util.Scanner;

public class Reverse_String {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	    String str = s.next();
	    int x = (str.length()-1);
		for(int i= x; i>=0;i--) {
			System.out.print(str.charAt(i));
		}
	}

}



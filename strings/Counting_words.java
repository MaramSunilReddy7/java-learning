package Strings;

import java.util.Scanner;

public class Counting_words {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	    String str = s.next();
	    if(str.length() == 0) {
	    	System.out.println("no string found so returning 0");
	    }else {
		int Count = 0;
		for(int i= 0; i<str.length();i++) {
			Count = Count+1;
		}System.out.println(Count);
	}

	}
}


package Strings;

import java.util.Scanner;

public class Palindrome {
   public static boolean CheckPalindrome(String str) {
	   int left = 0;
	   int right= str.length() - 1;
	   while(left < right) {
		   if(str.charAt(left) != str.charAt(right)) {
			   return false;
		   }
		   else
		   {
			   ++left;
			   --right;
		   }
	   }
	   return true;
   }
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	    String str = s.next();
	    boolean ans = CheckPalindrome(str);
	    System.out.println(ans);
	}
}

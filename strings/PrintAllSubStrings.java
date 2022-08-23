package Strings;

public class PrintAllSubStrings {

	public static void main(String[] args) {
     String str = "abc";
     for(int i = 0; i<str.length();i++) {
    	 System.out.print(str.charAt(i));
    	 for(int j = 0;j<i;j++) {
    		// System.out.print(str.charAt(i));
    		 System.out.print(str.charAt(j));
    		 System.out.println();
    		 
    	 }
     }
	}

}

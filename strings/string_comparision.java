package Strings;

public class string_comparision {

	public static void main(String[] args) {
		String str1 = "abc";
		String str2 = "abc";
		 if(str1 == str2) {
    	 System.out.println("Both are equal"); // both strings are refering to the abc
	     }else {
	    	 System.out.println("Both are not equal");  
	     }
		 String str3 = new String("abc");
		 if(str1 == str3) {
			 System.out.println("Both are equal"); // both strings are not  refering to the abc. As str3 is refering to new abc in stringpool 
	     }else {
	    	 System.out.println("Both are not equal");  
	     }
		
	}		
//     int arr1[] = {1,2,3};
//     int arr2[] = {1,2,3};
//     if(arr1 == arr2) {
//    	 System.out.println("Both are equal");
//     }else {
//    	 System.out.println("Both are not equal"); // because arr1 and arr2 addresess are different 
//     }
	}



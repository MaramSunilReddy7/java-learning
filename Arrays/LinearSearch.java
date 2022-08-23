package arrays;

import java.util.Scanner;

public class LinearSearch {
	//take the input and input elements from the user
	public static int[] takeInput() {  
		 Scanner s = new Scanner(System.in);
	      int n = s.nextInt();
	      int arr[] = new int[n];
	      for(int i =0; i<n;i++) {
	    	  System.out.print("enter the " + i + "th index value: ");
	    	  arr[i] = s.nextInt();
	      }return arr;
	}
	//print the elements in the array
//	public static void printArray(int[] arr) { 
//		int  n = arr.length;
//		for(int i = 0; i<n; i++) {
//	    	  System.out.print(arr[i] + " ");
//	      }
//	}
	
	
	//linearly search the element and return its index if found. 
     public static int LinearSearchOfX(int[] arr, int x) {
    	 for(int i=0;i<arr.length;i++) {
    		 if(x == arr[i]) {
    			 return i;
    		 }
    	 }return -1;
    	 
     }
	public static void main(String[] args) {
		 int arr[] = takeInput();
		 Scanner s = new Scanner(System.in);
		 System.out.print("element to be searched: ");
		 int x = s.nextInt();    // element to be searched
      //   printArray(arr);
         System.out.println();
        int answer = LinearSearchOfX(arr,x);
        if (answer == -1) {
        	System.out.println("element not found so , returning -1");
        }else {
        	System.out.println("element found at index: " + answer);
        }
	}

}

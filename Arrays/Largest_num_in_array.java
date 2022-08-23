package arrays;

import java.util.Scanner;

public class Largest_num_in_array {
	//take input and elements from user
	public static int[] takeInput() {  
		 Scanner s = new Scanner(System.in);
	      int n = s.nextInt();
	      int arr[] = new int[n];
	      for(int i =0; i<n;i++) {
	    	  System.out.print("enter the " + i + "th index value: ");
	    	  arr[i] = s.nextInt();
	      }return arr;
	}
	//print the elements
	public static void printArray(int[] arr) { 
		int  n = arr.length;
		for(int i = 0; i<n; i++) {
	    	  System.out.print(arr[i] + " ");
	      }
	}
//finding largest element in an array
	public static int LargestNum(int[] arr) {
		int largest = arr[0];
		for(int i =1; i<arr.length; i++) {
			if( largest < arr[i]) {
				largest = arr[i];
			}
		}return largest;
	}
	
	public static void main(String[] args) {
		 int arr[] = takeInput();
         printArray(arr);
         System.out.println();
         int answer = LargestNum(arr);
         System.out.println("Largest element in the array is: " + answer);
	}

}

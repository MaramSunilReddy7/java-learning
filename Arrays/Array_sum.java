package arrays;

import java.util.Scanner;
//taking input from user
public class Array_sum {
	public static int[] takeInput() {  
		 Scanner s = new Scanner(System.in);
	      int n = s.nextInt();
	      int arr[] = new int[n];
	      for(int i =0; i<n;i++) {
	    	  System.out.print("enter the " + i + "th index value: ");
	    	  arr[i] = s.nextInt();
	      }return arr;
	}
//printing the inputs
	public static void printArray(int[] arr) { 
		int  n = arr.length;
		for(int i = 0; i<n; i++) {
	    	  System.out.print(arr[i] + " ");
	      }
	}
//calculating the array sum
	public static int ArraySum(int[]arr) {
		int n = arr.length;
		int sum = 0;
		for(int i=0;i<n;i++) {
			sum += arr[i];
		}
		return sum;
		//System.out.println("sum of elements in an array is: " + sum);
	}
	
	
	public static void main(String[] args) {
		 int arr[] = takeInput();
         printArray(arr);
         System.out.println();
         int Answer = ArraySum(arr);
         System.out.println(Answer);
      
	}

}

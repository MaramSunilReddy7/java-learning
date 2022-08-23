package arrays;

import java.util.Scanner;

public class InputOfArray {

	public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      int n = s.nextInt();
      int arr[] = new int[n];
      for(int i =0; i<n;i++) {
    	  System.out.print("enter the " + i + "th index value: ");
    	  arr[i] = s.nextInt();
      }
      System.out.print("elements in the array are:");
      for(int i = 0; i<n; i++) {
    	  System.out.print(arr[i]);
      }
	}

}

package sorting;

import java.util.Scanner;

public class Binary_Search {
	//take input from user which is sorted array of n-element
	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
	    int[] arr = new int[n];
		for(int i = 0; i<n; i++) {
			System.out.println("enter the " + i + "th element of an array: ");
			arr[i] = s.nextInt();
		}
		//printing the array
		for(int i = 0; i<n;i++) {
			System.out.print(arr[i] + " ");
		}
		
	return arr;	
	}
	public static void BinaryS(int[] arr, int x, int i, int j){
		i = 0;
	    j = arr.length;
		if(i==j)  //array has only one element
		{
			if (arr[i] ==x) {
	        	  System.out.println("element " +x + "is found at index: " + i);
			}else {
				System.out.println("element not found, so returning -1");
			}
		}
		else {
			//array has more than one element
          int mid = (i+j)/2 ; 
          if(x==arr[mid]) {
        	  System.out.println("element " +x + "is found at index: " + mid);;
          }else {
        	  if(x<arr[mid]) {
        		  BinaryS(arr, x, i, mid-1);
        	  }else {
        		  BinaryS(arr,x,mid+1,j);
        	  }
          }
		}
		
		
		
		
	}

	public static void main(String[] args) {
		int[] input = takeInput();
		int i =0;
		int j = input.length;
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		BinaryS(input,x,i,j);
		
	//int[] arr = {2,4,7,33,56,79,80};
    //BinarySearch(arr);
	}

}

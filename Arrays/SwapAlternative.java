package arrays;

import java.util.Scanner;

public class SwapAlternative {
	//take input
//	public static void TakeInput() {
//		 Scanner s = new Scanner(System.in);
//		    int n = s.nextInt();   //array size
//		    int arr[] = new int[n];  //array created
//		    for(int i = 0; i<n; i++) {
//		    	System.out.println("enter the " + i + "th element");
//		    	arr[i] = s.nextInt();
//		    }
//	}
//	//swap alternative
	public static int[] Swap(int[] arr) {
		for(int i = 0; i<(arr.length-1); i=i+2) {
			int temp = arr[i];
			arr[i] = arr[i+1];
			arr[i+1] = temp;
		//System.out.print(arr[i+1] + " " + temp );
		}return arr;
		
	}
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6};
		int[] answer = Swap(arr);
		System.out.println("after swap elements are: ");
		for(int i = 0; i<(arr.length);i++) {
		System.out.print(" " + arr[i]);
		}
	}

}

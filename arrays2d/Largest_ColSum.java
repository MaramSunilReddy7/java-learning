package arrays2d;

import java.util.Scanner;

public class Largest_ColSum {
	public static int[][] takeInput(){
		 // taking rows and columns from user
		Scanner s = new Scanner(System.in);
		System.out.println("enter the no of rows: ");
		int rows = s.nextInt();
		System.out.println("enter the no of columns: ");
		int cols = s.nextInt();
		//create a 2d array from rows and columns
		int[][] arr = new int[rows][cols];
		//taking each [row][col] element from user
		for(int i = 0; i<rows;i++) {
			for(int j = 0; j<cols; j++) {
				System.out.println("enter the element at" + i + "th row " + j + "th column: ");
				arr[i][j] = s.nextInt();
			}
		}return arr;
	}
	//print the 2d array
		public static void print2dArray(int[][] arr) {
			int rows = arr.length;
			int cols = arr[0].length;
			for(int i = 0; i<rows;i++) {
				for(int j = 0; j<cols;j++) {
					System.out.print(arr[i][j] + " "); //printing all the elements of ith row in one line
				}
				System.out.println();
			}
		}
    // calculating column wise sum and returning the largest
		public static int LargestColSum(int[][] arr) {
			int rows = arr.length;
			int cols = arr[0].length;
			int largest = Integer.MIN_VALUE;
			for(int j = 0; j<cols; j++) {
				int colsum = 0;
				for(int i = 0; i< rows; i++) {
					colsum += arr[i][j];
				}
				if(colsum > largest) {
					largest = colsum;
				}
			}return largest;
		}
	public static void main(String[] args) {
		int[][] input = takeInput();
		print2dArray(input);
		int answer = LargestColSum(input);
		System.out.println(answer);
	}

}

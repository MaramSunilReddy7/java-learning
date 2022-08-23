package arrays2d;
import java.util.Scanner;
public class Input_print {

	public static void main(String[] args) {
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
		}
		//print the 2darray
		for(int i = 0; i<rows;i++) {
			for(int j = 0; j<cols;j++) {
				System.out.print(arr[i][j] + " "); //printing all the elements of ith row in one line
			}
			System.out.println();
		}
		System.out.println(arr.length);
	}

}

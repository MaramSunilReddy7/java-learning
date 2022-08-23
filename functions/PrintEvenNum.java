package functions;

import java.util.Scanner;

public class PrintEvenNum {
	public static void EvenNum(int start, int end) {
		if(start % 2 !=0) {
			start++;
		}
		for(int i = start; i<=end; i+=2) {
			System.out.println(i);
		}
	}
	
	
	
	
//   public static void EvenNum() {
//	   int i = 2;
//	   for (i=2;i<=100;i+=2) {
//		   System.out.println(i);
//	   }
//   }
	public static void main(String[] args) {
         // EvenNum();
		 Scanner s = new Scanner(System.in);
		 int start = s.nextInt();
		 int end = s.nextInt();
		EvenNum(start, end);
		
	}

}

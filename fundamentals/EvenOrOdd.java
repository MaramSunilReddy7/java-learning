package fundamentals;
import java.util.Scanner;
public class EvenOrOdd {

	public static void main(String[] args) {
         Scanner s = new Scanner(System.in);
         int a = s.nextInt();
         if (a%2 == 0) {
        	 System.out.println("Even Number");
        	 return;
         }
         //else {
        	 System.out.println("Odd number");
         }
	}



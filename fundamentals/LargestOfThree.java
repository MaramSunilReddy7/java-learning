package fundamentals;
import java.util.Scanner;

public class LargestOfThree {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		 
		if(a>=b & a>=c)
		{
			System.out.println(a);
			System.out.println("A");
			return;
		}
		else {
			if(b>=a & b>=c)
			{
				System.out.println(b);
				System.out.println("B");
				return;
			}
			System.out.println(c);
			System.out.println("C");
		}
       
	}

}

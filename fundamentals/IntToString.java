package fundamentals;
import java.util.Scanner;
public class IntToString {

	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        if ( a== 1)
        {
        	System.out.println("One");
        	return;
        }else {
        	if(a==2) {
        		System.out.println("Two");
        		return;
        	}
        	
        	else
        		{
        		if(a==3)
        			{
        			System.out.println("Three");
        			return;
        			}
        		}
        }
	}

}

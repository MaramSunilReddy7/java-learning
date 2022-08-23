package functions;

import java.util.Scanner;

public class NcR {

	public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      int n = s.nextInt();
      int r = s.nextInt();
      ///factorial of N
      int FactN = 1;
      for (int i =1; i<=n;i++) {
    	  FactN = FactN * i;
      }
    ///factorial of R
      int FactR = 1;
      for (int i =1; i<=r;i++) {
    	  FactR = FactR * i;
      }
    ///factorial of N-R
      int FactNR = 1;
      for (int i =1; i<=n-r;i++) {
    	  FactNR = FactNR * i;
      }
      //result
      int result = FactN / (FactR * FactNR);
      System.out.println(result);
	}

}

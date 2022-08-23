package Strings;
import java.util.Scanner;
public class takeInput {

	public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String str;
    str = s.next(); //goes upto delimiter (space,tab \t, enter \n) came
    System.out.println(str + " "+ str.length());
    String str2 = s.next();
    System.out.println(str2 + " " + str2.length()); // gives 2nd string in the line
    String str3 = s.nextLine();
    System.out.println((str3 + " " + str3.length())); //gives string after str2  including spaces
	}

}

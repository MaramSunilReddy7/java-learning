package Strings;

public class StringDemo2 {

	public static void main(String[] args) {
		char arr[] = {'C','o','d','i','n','g'};  //character type
		String str1 = "Coding";
		String str2 = "Is love";
		String str3 = " -msd";
		String str4 = "Ceding";
		//str1 +=str2; //str1 = str1.concat(str2); //adding two strings
		//System.out.println(str1);
		//System.out.println(str1.equals(str3)); //gives boolean if str1 == str2
		//System.out.println(str1.compareTo(str4)); //compare both the strings and returns ASCII value difference btw them.
		System.out.println(str1.contains("ing"));  // gives boolean if <chars> presents in the str1 string.
	}

}

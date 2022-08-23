package Strings;

public class ReverseEachWord {
	
	public static String reverseEachWord(String str) {
		String ans = "";
		int StartIndex = 0;
		int i = 0;
		//visit all the string
		for(; i< str.length()-1;i++) {
			//check for space, if space at 'i', then 0 to i-1 is one word
			if(str.charAt(i)== ' ') {
			int EndIndex = i-1;
			String reverseWord = "";
			//visit all the words and reverse it
			for(int j = StartIndex; j<=EndIndex;j++) {
				reverseWord = str.charAt(j) + reverseWord;
				StartIndex = i+1;
			}
			//add it to final string
			ans += reverseWord + " ";
			}
		}
		// at last word we can't find space so take care of last word separately.
		int EndIndex = i;
		String reverseWord = "";
		//visit all the words and reverse it
		for(int k = StartIndex; k<=EndIndex;k++) {
		reverseWord = str.charAt(k) + reverseWord;
		}
		ans += reverseWord;
		return ans;
	}

	public static void main(String[] args) {
		String str = "abc def ghi jkl";
		System.out.println(reverseEachWord(str));

	}

}

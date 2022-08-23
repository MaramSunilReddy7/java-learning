package Strings;

public class reverseEachStrWordWise {
    public static String ReverseStringWordwise(String str) {
    	String ans = "";
    	int CurrentStartWord = 0;
    	int i = 0;
    	//go through all over thr string
    	for(; i<str.length(); i++) {
    		//check for spaces, so we can conculde that startchar to space-1 is one word
    		if(str.charAt(i)==' ') {
    			int CurrentEndIndex =i-1;
    			String Word = "";
    			for(int j =CurrentStartWord; j<= CurrentEndIndex; j++) {
    				Word = Word + str.charAt(j);
    				CurrentStartWord = i+1;
    			}
    			//add word to final string
    			ans  = Word  + ans ;
    			
    		}
    	}
    	int CurrentEndIndex =i-1;
		String Word = "";
		for(int j =CurrentStartWord; j<= CurrentEndIndex; j++) {
			Word = Word + str.charAt(j);
		}
		//add word to final string
		ans  =  Word + " " + ans ;
		//CurrentStartWord = i+1;
    	
    	return ans;
    }
	public static void main(String[] args) {
     String str = " abc def ghi";
     System.out.println(ReverseStringWordwise(str));
	}

}

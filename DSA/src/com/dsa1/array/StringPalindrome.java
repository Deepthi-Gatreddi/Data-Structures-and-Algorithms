package com.dsa1.array;

public class StringPalindrome {
    public boolean isPalindrome(String word) {
    	char charArray[]=word.toCharArray();
    	int start=0;
    	int end=charArray.length-1;
    	while(start<end) {
    		if(charArray[start]!=charArray[end])
    			return false;
    		start++;
        	end--;
    	}
    	return true;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word="madam";
		StringPalindrome obj=new StringPalindrome();
		if(obj.isPalindrome(word))
			System.out.println("The String is a Palindrome");
		else
			System.out.println("The string is not a Palindrome");

	}

}

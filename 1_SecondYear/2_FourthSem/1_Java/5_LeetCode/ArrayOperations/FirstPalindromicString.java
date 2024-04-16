// 2108. Find First Palindromic String in the Array.
/*
Given an array of strings words, return the first palindromic string in the array. If there is no such string, return an empty string "".

A string is palindromic if it reads the same forward and backward.
*/

class FirstPalindromicString {
    public String firstPalindrome (String[] words) {
        for (String str : words) {
          String reverseString = "";
            for (int i = str.length() - 1; i >= 0; i--) {
                reverseString += str.charAt(i);
            }
            
            if (reverseString.equals(str))
                return str;
        }
        return "";
    }
    
    public static void main (String[] args) {
        FirstPalindromicString strObj = new FirstPalindromicString();
        String[] words = {"def","ghi"};
        System.out.println(strObj.firstPalindrome(words));
        
    }
}

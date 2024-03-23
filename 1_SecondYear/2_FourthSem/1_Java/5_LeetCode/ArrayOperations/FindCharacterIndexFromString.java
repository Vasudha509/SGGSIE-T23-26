// 2942. Find words containing character - Java Language
/*
You are given a 0-indexed array of strings words and a character x.
Return an array of indices representing the words that contain the character x.
Note that the returned array may be in any order.

Example 1:

Input: words = ["leet","code"], x = "e"
Output: [0,1]
Explanation: "e" occurs in both words: "leet", and "code". Hence, we return indices 0 and 1.

Example 2:

Input: words = ["abc","bcd","aaaa","cbc"], x = "a"
Output: [0,2]
Explanation: "a" occurs in "abc", and "aaaa". Hence, we return indices 0 and 2.

Example 3:

Input: words = ["abc","bcd","aaaa","cbc"], x = "z"
Output: []
Explanation: "z" does not occur in any of the words. Hence, we return an empty array.

*/
import java.util.Scanner;

class FindCharacterIndexFromString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FindCharacterIndexFromString objIndex = new FindCharacterIndexFromString();
        
        System.out.print("Enter the length of the string array : ");
        int lenStringArray = sc.nextInt();
        
        String[] sArray = new String[lenStringArray];
        
        // User input for entering the string array
        System.out.println("Enter the string : ");
        for (int i = 0; i < lenStringArray; i++) 
            sArray[i] = sc.next();
        
        // Showing the string array to end user
        System.out.println("Given string array : ");
        for (String element : sArray)
            System.out.println(" " + element);
            
        System.out.println("Enter the character which you want to search : ");
        char x = sc.next().charAt(0);
            
        int[] result = objIndex.findIndex(sArray, x);
        
        System.out.println("Indexes : ");
        for (int index : result) 
            System.out.print("  " + index);
    }
    
    
    // Method to find the indexes of the character in string's array to get it's count
    int[] findIndex(String[] strArray, char x) {
        //System.out.println("Inside findIndex");
        int len = strArray.length;
        //System.out.println("length of input array : "+len);
        int[] result = new int[len];
        
        int m = 0;
        for (int i = 0; i < strArray.length; i++) {
            String strElement = strArray[i];
            //System.out.println("Element of array : "+strElement);
            
            for (int j = 0; j < strElement.length(); j++) {
                if (strElement.charAt(j) == x) {
                    result[m] = i;
                    m++;
                    break;
                } else {
                    continue;
                }
            }
        }
        return result;
    }    
}



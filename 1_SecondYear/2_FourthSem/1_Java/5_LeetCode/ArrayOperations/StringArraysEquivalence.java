// 1662. Check If Two String Arrays are Equivalent
/*
Given two string arrays word1 and word2, return true if the two arrays represent the same string, and false otherwise.
A string is represented by an array elements concatenated in order forms the string.
*/
class StringArraysEquivalence {
    public boolean arrayStringsAreEqual (String[] word1, String[] word2) {
        String str1 = null, str2 = null;
        
        for (String str : word1) 
            str1 += str;
            
        for (String str : word2) 
            str2 += str;
            
        if (str1.equals(str2)) 
            return true;
        
        return false;
    }

    public static void main(String[] args) {
        StringArraysEquivalence strObj = new StringArraysEquivalence();
        String[] word1 = {"abd", "c"};
        String[] word2 = {"a", "bc"};
        System.out.println(strObj.arrayStringsAreEqual(word1, word2));
    }
}

// 1816. Truncate Sentence
/* A sentence is a list of words that are separated by a single space with no leading or trailing spaces. Each of the words consists of only uppercase and lowercase English letters (no punctuation).
E.g. "Hello World", "hello".
You are given a sentence s and an integer k. You want to truncate s such that it contains only the first k words. Return s after truncating it.
*/

class TruncateSentence {
 public static void main(String[] args) {
        TruncateSentence tsObj = new TruncateSentence();
        String input = "chopper is not a tanuki";
        int k = 5;
        
        System.out.println(""+tsObj.truncateSentence(input, k));
    }
    public String truncateSentence(String s, int k) {
        String[] str = s.split(" ");
        s = "";
        for (int i = 0; i < k; i++) {
            s += str[i] + " ";
        }        
        return s.trim();   
    }
}

/*
Effective solution
class Solution {
    public String truncateSentence(String s, int k) {
        String[] strArr = s.split(" ");
        StringBuilder sb1 = new StringBuilder();
        for (int i = 0; i < k; i++) {
            sb1.append(strArr[i]).append(" ");
        }
        return sb1.deleteCharAt(sb1.length() - 1).toString();
    }
}
*/


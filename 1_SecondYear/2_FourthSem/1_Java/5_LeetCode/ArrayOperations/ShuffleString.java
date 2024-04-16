// 1528. Shuffle String
/*
  You are given a string s and an integer array indices of the same length. The string s will be shuffled such that the character at the ith position moves to indices[i] in the shuffled string.
  Return the shuffled string.
*/

class ShuffleString {
    public String restoreString(String s, int[] indices) {
        StringBuilder shuffledString = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < s.length(); j++) {
                if (indices[j] == i) 
                    shuffledString.append(s.charAt(j));
            }
        }
        return shuffledString.toString();
    }
    
    public static void main(String[] args) {
        ShuffleString ssObj = new ShuffleString();
        String s = "codeleet";
        int[] indices = {4,5,6,7,0,2,1,3};
        System.out.println(ssObj.restoreString(s, indices));
    }
}

/*
Most effective one

class Solution {
    public String restoreString(String s, int[] indices) {
        char[] arr = new char[s.length()];
        for(int i =0; i<s.length(); i++){
            arr[indices[i]] = s.charAt(i);
        }
        return String.valueOf(arr);
        
    }
}
*/



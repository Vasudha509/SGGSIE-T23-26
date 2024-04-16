// 1720. Decode XORed Array

class DecodingXORedArray {
    public static void main(String[] args) {
        DecodingXORedArray objArray = new DecodingXORedArray();
        
        int[] inputArray = {6,2,7,3};
        int first = 4;
        int[] outputArray = objArray.decode(inputArray, first);
        for (int ele : outputArray) 
            System.out.print(" " + ele);
    }
    
    public int[] decode(int[] encoded, int first) {
        int[] arr = new int[encoded.length+1];
        arr[0] = first;
        
        for (int i = 0; i < encoded.length; i++) {
            int j = 0;
            while (true) {
                if ((arr[i] ^ j) == encoded[i]) {
                    arr[i+1] = j;
                    break;
                }
                j++;
            }
        }
        return arr;
    }
}

/* 
-----Effective solution.
class Solution {
    public int[] decode(int[] encoded, int first) {
        int code[]=new int[encoded.length+1];
        code[0]=first;
        for(int i =0 ;i<encoded.length;i++){
            code[i+1]=code[i]^encoded[i];
        }
        return code;
    }
}
*/

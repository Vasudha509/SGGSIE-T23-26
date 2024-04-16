// 2367. Number of Arithmetic Triplets
/*
  You are given a 0-indexed, strictly increasing integer array nums and a positive integer diff. A triplet (i, j, k) is an arithmetic triplet if the following conditions are met:
   - i < j < k
   - nums[j] - nums[i] == diff
   - nums[k] - nums[j] == diff
*/

class ArithmeticTriplets {
    public int arithmeticTriplets (int[] nums, int diff) {
      int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[j] - nums[i] == diff) {
                    for (int k = j + 1; k < nums.length; k++) {
                        if (nums[k] - nums[j] == diff) {
                            count++;
                        }
                    }
                }   
            }
        }
        return count;
    }
    
    public static void main (String[] args) {
        ArithmeticTriplets atObj = new ArithmeticTriplets();
        int[] nums = {4,5,6,7,8,9};
        int diff = 2;
        System.out.println(atObj.arithmeticTriplets(nums, diff));
    }
}

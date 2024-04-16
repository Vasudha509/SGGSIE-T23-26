// 3065. Minimum Operations to Exceed Threshold Value I
/*
You are given a 0-indexed integer array nums, and an integer k.

In one operation, you can remove one occurrence of the smallest element of nums.

Return the minimum number of operations needed so that all elements of the array are greater than or equal to k.
*/

class MinOperations {
    public int minOperations(int[] nums, int k) {
      int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < k)
                count++;
        }
        return count;
    }
    
    public static void main(String[] args) {
        MinOperations minObj = new MinOperations();
        int[] nums = {2,11,10,1,3};
        int k = 10;
        System.out.println(minObj.minOperations(nums, k));
    }
}

// 1909. Remove One Element to Make the Array Strictly Increasing.
/*
Given a 0-indexed array nums, return true if it can be made strictly increasing after removing exactly one element, or false otherwise. If the array is already strictly increasing, return true.
The array nums is strictly increasing if nums[i - 1] < nums[i] for each index (1 <= i < nums.length).
*/

class RemoveOneElement {
    public boolean canBeIncreasing (int[] nums) {
      boolean isIncreasing = false;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] < nums[i]) 
                isIncreasing = true;
             else {
                for (int j = i  ; j < nums.length; j++) {
                    nums[j-1] = nums[j];
                }
                 isIncreasing = false;
                 
             }
        }
        return isIncreasing;
    }
    
    public static void main (String[] args) {
        RemoveOneElement rmObj = new RemoveOneElement();
        int[] nums = {2,3,1,2};
        System.out.println(rmObj.canBeIncreasing(nums));
    }
}

// 2006. Count Number of Pairs With Absolute Difference K
/*
Given an integer array nums and an integer k, return the number of pairs (i,j) where i < j such that |nums[i] - nums[j]| == k.
The value of |x| is defined as:
	x if x >= 0
	-x if x < 0.
*/

class CountNumberOfPairs {
	public int countKDifference(int[] nums, int k) {
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (Math.abs(nums[i] - nums[j]) == k)
					count++;
			}
		}
		return count;
	}
	
	public static void main (String[] args) {
		CountNumberOfPairs countObj = new CountNumberOfPairs();
		int[] nums = {3,2,1,5,4};
		int k = 2;
		System.out.println(countObj.countKDifference(nums, k));
	}
}

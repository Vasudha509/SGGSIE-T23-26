class Left_RightSumDifference {
	public static void main (String[] args) {
		Left_RightSumDifference obj = new Left_RightSumDifference();
		int[] nums = new int[]{10, 4, 8, 3};
		int[] result = new int[nums.length];
		result = obj.leftRightDifference(nums);
		for (int num : result) {
			System.out.print(" "+num);
		}
	}
	
	public int[] leftRightDifference(int[] nums) {
		int[] answer = new int[nums.length];
		int[] leftSum = new int[nums.length];
		int[] rightSum = new int[nums.length];
		
		// Finding the left sum 
		leftSum[0] = 0;
		int k = 1;
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < i; j++) {
				leftSum[k] += nums[i] + nums[j];
			}
				k++;
		}
		
		return leftSum;
		
	}
}

/*


*/

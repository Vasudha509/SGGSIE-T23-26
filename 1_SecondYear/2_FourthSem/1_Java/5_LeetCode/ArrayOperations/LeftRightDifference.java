class LeftRightDifference {
	// Method to find the sum of difference between left and right element of array.
	// i/p: [10, 4, 8, 3]
	// o/t: [15, 1, 11, 22 ]
	
	public int[] leftRightDifference (int[] nums) {
		int[] answer = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			answer[i] = Math.abs(leftSum(nums, i) - rightSum(nums, i));
		}	
		return answer;
	}
	
	// Method to find left sum.
	int leftSum(int[] nums, int index) {
		int lSum = 0;
		if (index == 0)
			return index;
			
		for (int i = 0; i < index; i++) {
			lSum += nums[i]; 
		}
		return lSum;			
	}	
	
	// Method to find right sum.
	int rightSum(int[] nums, int index) {
		int rSum = 0;
		for (int i = 0; i < nums.length; i++) {
		    if (index < i) {
		        rSum += nums[i];
		    }
		}		
		return rSum;
	}
	
	public static void main(String[] args) {
		int[] nums = new int[]{10,4,8,3};
		LeftRightDifference lrObj = new LeftRightDifference();
		
		int[] result = lrObj.leftRightDifference(nums);
		System.out.print("[");
		for (int num : result) 
			System.out.print(" " + num);
		System.out.print(" ]");
	}
}

class CreateTargetArray {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> ans = new ArrayList<>();
        int[] res = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            ans.add(index[i], nums[i]);
        }

        int h = 0;
        for (int a : ans) {
            res[h++] = a;
        }
        return res;
    }
    
    public static void main(String[] args) {
    	CreateTargetArray arrayObj = new CreateTargetArray();
    	
    	int[] nums = new int[]{1, 2, 3, 4, 0};
    	int[] index = new int[]{0, 1, 2, 3, 0};
    	int[] target = new int[nums.length];
    	
    	target = arrayObj.createTargetArray(nums, index);
    	
    	for(int num : target) 
    		System.out.print(" " + num);
    }
}

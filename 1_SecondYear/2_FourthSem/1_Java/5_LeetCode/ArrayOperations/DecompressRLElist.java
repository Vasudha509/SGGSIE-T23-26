// 05/04/2024
// Leetcode 1313. Decompress Run-Length Encoded list
import java.util.List;
import java.util.ArrayList;

class DecompressRLElist {
    public int[] decompressRLElist(int[] nums) {
        List<Integer> ls = new ArrayList<>();
        
        int i = 0;
        while ( i < nums.length) {
            for (int j = 0; j < nums[i]; j++) {
                ls.add(nums[i+1]);
            }
            i += 2;
        }
        
        int[] ans = new int[ls.size()];
        for (int k = 0; k < ans.length; k++) {
            ans[k] = ls.get(k);
        }
        return ans;
    }
    
    public static void main(String[] args) {
      DecompressRLElist obj = new DecompressRLElist();
        int[] nums = {1,2,3,4};
        int[] output = new int[nums.length];
        
        output = obj.decompressRLElist(nums);
        for (int num : output) 
            System.out.print(" " + num);
    }
}

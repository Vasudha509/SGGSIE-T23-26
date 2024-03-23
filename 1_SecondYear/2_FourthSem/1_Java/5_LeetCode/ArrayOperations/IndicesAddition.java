// 2859. Sum of Values at Indices With K Set Bits.
import java.util.ArrayList;
import java.util.List;

class IndicesAddition {
    public static void main(String[] args) {
        IndicesAddition obj = new IndicesAddition();
        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);
       // list.add(2);
        
        System.out.println(list);
        
        int k = 2;
        int result = obj.sumIndicesWithKSetBits(list, k);
        System.out.println(result);
    }
    
    // Method to find the sum of indices with k set of bits.
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
      int sum = 0;
            for (int i = 0; i < nums.size(); i++) {
              int count = 0;
                String binaryOfIndex = Integer.toBinaryString(i);
                
                for (int j = 0; j < binaryOfIndex.length(); j++) {
                    if (binaryOfIndex.charAt(j) == '1') {
                        count++;
                    }
                }
                
                //System.out.println(i + " "+ count);
                //System.out.println("Element : "+nums.get(i));
                
                if (count == k) {
                    sum += nums.get(i);
                }
                
                
            }  
      return sum;
    }
    
    // Method to find the binary representation of the each value in list
}

/*Most effective solution found on LeetCode
class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
               int count = 0;

        for (int i = 0; i < nums.size(); i++) {

            if (Integer.bitCount(i) == k) {
                count += nums.get(i);
            }
        }
        return count;
    }
}
*/

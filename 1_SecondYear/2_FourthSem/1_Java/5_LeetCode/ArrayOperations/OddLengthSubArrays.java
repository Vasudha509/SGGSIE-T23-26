// 1588. Sum of All Odd Length Subarrays.
/*
Given an array of positive integers arr, return the sum of all possible odd-length subarrays of arr.
A subarray is a contiguous subsequence of the array.
*/

class OddLengthSubArrays {
    public int sumOddLengthSubarrays (int[] arr) {
      int eleSum = 0;
      int arrayLength = arr.length;
      if (arrayLength % 2 != 0) {
          
      }
        for (int i = 0; i < arr.length; i++) {
            eleSum += arr[i];
        }
    }
    
    public static void main (String[] args) {
        OddLengthSubArrays oddObj = new OddLengthSubArrays();
        int[] arr = {1,4,2,5,3};
        System.out.println(oddObj.sumOddLengthSubarrays(arr));
    }
}

/*
1] Find the odd array
2] Add elements of an odd array
*/

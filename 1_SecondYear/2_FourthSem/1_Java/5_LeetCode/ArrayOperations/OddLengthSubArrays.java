// 1588. Sum of All Odd Length Subarrays.
/*
Given an array of positive integers arr, return the sum of all possible odd-length subarrays of arr.
A subarray is a contiguous subsequence of the array.
*/

class OddLengthSubArrays {
    public int sumOddLengthSubarrays (int[] arr) {
      int n = arr.length; // the length of the input array
      int totalSum = 0;   // This will hold the sum of all odd-length subarrays
      
      // We iterate over each element of the array as the start point for out subarrays.
      for (int startIndex = 0; startIndex < n; ++startIndex) {
          int subarraySum = 0; // Holds the sum of the current subarray.
          
          // We increases the end point of our subarray one element at a time
          for (int endIndex = startIndex; endIndex < n; ++endIndex) {
              subarraySum += arr[endIndex];
              
              // Check if the length of the current subarray is odd
              if ((endIndex - startIndex + 1) % 2 == 1) {
                  totalSum += subarraySum;
              }
          }
      }
      
      return totalSum;
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

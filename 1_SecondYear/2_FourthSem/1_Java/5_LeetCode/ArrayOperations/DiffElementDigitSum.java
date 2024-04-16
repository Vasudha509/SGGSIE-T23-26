// 2535. Difference Between Element Sum and Digit Sum of an Array
/*
  You are given a Positive integer array nums.
    - The element sum is the sum of all the elements in nums.
    - The digit sum is the sum of all the digits (not necessarily distinct) that appear in nums.
  Return the absolute difference between the element sum and digit sum of nums.
  Note that the absolute difference between two integers x and y is defined as | x - y|.
*/

class DiffElementDigitSum {
    public int differenceOfSum(int[] nums) {
          int sumOfElements = sumElements(nums);
          int sumOfDigits = sumDigits(nums);
          return Math.abs(sumOfElements - sumOfDigits);
    }
    
    // Method to find sum of elements
    int sumElements(int[] nums) {
      int sum = 0;
        for (int num : nums)
            sum += num;
      return sum;
    }
    
    // Method to fine sum of digits
    int sumDigits(int[] nums) {
        int sum = 0, rem;
        for (int num : nums) {
          while (num != 0) {
              rem = num % 10;
              num /= 10;
              sum += rem;
          }
        }
        return sum;
    }
    
    public static void main (String[] args) {
        DiffElementDigitSum eleObj = new DiffElementDigitSum();
        int[] nums = {1,2,3,4};
        System.out.println(eleObj.differenceOfSum(nums));
    }
}
/*
  1. Find sum of elements 
  2. Sum of digits
  3. Find the difference
*/

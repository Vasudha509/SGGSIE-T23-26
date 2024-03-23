import java.util.Scanner;

class RunningSumOfArrayEle {
      
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RunningSumOfArrayEle oSumArray = new RunningSumOfArrayEle();
      
        System.out.print("Enter the size of the array : ");
        int arraySize = sc.nextInt();
      
        int[] arrayElement = new int[arraySize];
        System.out.print("Enter element in array : ");
        for (int i = 0; i < arraySize; i++) {
          arrayElement[i] = sc.nextInt();
        }
      
        int[] result = oSumArray.runningSum(arrayElement);
      
        System.out.println("Result of an array : ");
        for (int i = 0; i < arraySize; i++) 
            System.out.print(" " + result[i]);
    }
    
    public int[] runningSum(int[] nums) {
        int iLength = nums.length;
        int[] result = new int[iLength];
        for (int i = 0; i < iLength; i++) {
            for(int j = 0; j <= i; j++) {
                result[i] += nums[j];
            }
        }            
        return result;
    }
}

// 1 2 3 = 1 3 5

/*
class Solution {
    public int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++){
            nums[i] = nums[i] + nums[i-1];
        }
        return nums;
    }
}
*/

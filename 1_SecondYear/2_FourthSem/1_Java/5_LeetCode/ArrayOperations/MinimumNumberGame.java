// 2974. Minimum Number Game
/**
You are given a 0-indexed integer array nums of even length and there is also an empty array arr. Alice and Bob decided to play a game where in every round Alice and Bob will do one move. The rules of the game are as follows:

Every round, first Alice will remove the minimum element from nums, and then Bob does the same.
Now, first Bob will append the removed element in the array arr, and then Alice does the same.
The game continues until nums becomes empty.
Return the resulting array arr.
*/
import java.util.Arrays;

class MinimumNumberGame {
    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        
        for (int i = 0; i < nums.length; i += 2) {
            int temp = nums[i];
            nums[i] = nums[i + 1];
            nums[i + 1] = temp;
        }
        
        return nums;
    }
    
    public static void main(String[] args) {
        MinimumNumberGame objGame = new MinimumNumberGame();
        int[] nums = {5,4,3,2};
        int[] arr= new int[nums.length];
        arr = objGame.numberGame(nums);
        for (int ele : arr)
          System.out.print(" " + ele);
    }
}

/*
QuickSort: Is a sorting algorithm based on the Divide and Conquer algorithm that picks an element as a pivot and partitions the given array around the picked pivot by placing the pivot in its conrrect position in the sorted array.
*/

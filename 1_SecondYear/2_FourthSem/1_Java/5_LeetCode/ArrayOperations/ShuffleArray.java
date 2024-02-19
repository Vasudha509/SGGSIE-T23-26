import java.util.Scanner;

class ShuffleArray {
// my logic 
    public int[] shuffle(int[] nums, int n) {
       int arraylength = nums.length;
       int[] returnArray = new int[arraylength];
       for (int i = 0; i < arraylength; i++) {
          if (i % 2 == 0) {
               returnArray[i] = nums[i];
          }          
          else {
              returnArray[i] = nums[n];
              n++;
              i++;
          }           
              
       }
       return returnArray;
    }
    
    // logic form google
    public int[] shuffle_1(int[] nums, int n) {
        int shuffled[] = new int[nums.length];
        for(int i = 0; i < n; i++) {
            shuffled[2 * i] = nums[i];
            shuffled[2 * i + 1] = nums[n + i];
        }
        
        return shuffled;
    }
    
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	ShuffleArray sa = new ShuffleArray();
    	
    	System.out.print("Enter the size of an array : ");
    	int size = sc.nextInt();
    	
    	int[] iArray = new int[size];
    	
    	System.out.println("Enter elements in an array : ");
    	for (int i = 0; i < size; i++) 
    		iArray[i] = sc.nextInt();
    		
	    System.out.print("Enter from where you want to shuffle : ");
	    int n = sc.nextInt();
	
	    int[] result = new int[size];
	    result = sa.shuffle_1(iArray, n);
	
	    System.out.println("The shuffled array : ");
	    for(int i = 0; i < size; i++) 
		      System.out.print(" " + result[i]);
    }
}


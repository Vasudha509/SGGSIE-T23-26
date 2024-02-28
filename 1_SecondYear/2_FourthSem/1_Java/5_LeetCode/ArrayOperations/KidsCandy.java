import java.util.List;
import java.util.ArrayList;

class KidsCandy {

    public static void main(String[] args) {
      KidsCandy kc = new KidsCandy();
      
    	int[] candies = {4,2,1,1,2};
    	int extraCandies = 1;
    	
    	List<Boolean> result = new ArrayList<>();
    	result = kc.kidsWithCandies(candies, extraCandies);
    	
    	for (boolean output : result) {
    	    System.out.println(" " + output);
    	}
    }
      
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int greatestCandyCount = 0;

        int greatestCandyCountInArray = findGreatestCandyCountInArray(candies);
        System.out.println(greatestCandyCountInArray);

        for (int candyCount : candies) {
            greatestCandyCount = candyCount + extraCandies;

            if (greatestCandyCount >= greatestCandyCountInArray) 
                result.add(true);
            else
                result.add(false);
        }

        return result;
    }

    int findGreatestCandyCountInArray(int[] candies) {
        int greatest = candies[0];
        for (int i = 0; i < candies.length; i++) {
            if (greatest < candies[i])
                greatest = candies[i];
        }
        return greatest;
    }
}

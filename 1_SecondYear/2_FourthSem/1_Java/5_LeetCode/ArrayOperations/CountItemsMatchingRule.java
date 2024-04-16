// 1773. Count Items Matching a Rule.
/*
You are given an array items, where each items[i] = [type, color, name] describes the type, color, and name of the ith item. You are also given a rule represented by two strings, ruleKey and ruleValue.
The ith item is said to match the rule if one of the following is true:
  ruleKey == "type" and ruleValue == type
  ruleKey == 'color' and ruleValue == color
  ruleKey == 'name' and rulevalue == name.
  
Return the number of items that match the given rule.
*/
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

class CountItemsMatchingRule {
    public int countMatches (List<List<String>> items, String ruleKey, String ruleValue) {
      int count = 0;
      int keyIndex = 0;
      
      // Determine index based on ruleKey
      switch (ruleKey) {
          case "type" :
              keyIndex = 0;
              break;
          
          case "color" :
              keyIndex = 1;
              break;
              
          case "name" :
              keyIndex = 2;
              break;
      }
      
      // Check each item against the rule
      for (List<String> item : items) {
          if (item.get(keyIndex).equals(ruleValue)) {
              count++;
          }
      }
      
      return count;
    }
    
    public static void main (String[] args) {
    CountItemsMatchingRule obj = new CountItemsMatchingRule();
        List<List<String>> items = new ArrayList<>();
        items.add(Arrays.asList("phone", "blue", "pixel"));
        items.add(Arrays.asList("computer", "silver", "lenovo"));
        items.add(Arrays.asList("phone", "gold", "iphone"));
        
        String ruleKey = "color";
        String ruleValue = "silver";
        
        int result = obj.countMatches(items, ruleKey, ruleValue);
        System.out.println("Number of items matching the rule: "+ result);
    }
}

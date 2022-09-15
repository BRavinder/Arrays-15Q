import java.io.*;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        // Create HashSet to store integers
        Set<Integer> inSet = new HashSet<>();
        
        // iterate over each element
        for(int num : nums) {
            
            // Check the number in hashset
            if(inSet.contains(num))
                return true;
            
            // add the number to hashset
            inSet.add(num);
        }
        return false;
    }
}
// Time Complexity : O(n)
// Space Complexity : O(n)
class Solution {
    public int singleNumber(int[] nums) {
        
        int xor = 0;
        
        // Accessing all the nums elements.
        
        for(int num : nums) {
            xor = xor^num;
        }
        return xor;
    }
}
// Time Comlexity : O(n)
// Space Comlexity : O(n)
        
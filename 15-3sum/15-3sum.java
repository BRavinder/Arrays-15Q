public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> HL = new HashSet<>();
        // sorting the Arrays
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 2; i++) {
            int first = i + 1;
            int last = nums.length - 1;
            
            while (first < last) {
                if(nums[i] + nums[first] + nums[last] == 0) {
                    HL.add(Arrays.asList(nums[i], nums[first], nums[last]));
                    first++;
                    last--;
                    
                }
                else if(nums[i] + nums[first] + nums[last] > 0) {
                    last--;
                }
                else {
                    first ++;
                }
            }
        }
        return new ArrayList<>(HL);
    }
}

// Time  Complexity == O(n^2)
// Space Complexity == O(logn)
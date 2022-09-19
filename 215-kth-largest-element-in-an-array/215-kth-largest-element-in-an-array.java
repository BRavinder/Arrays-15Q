class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue <>(Collections.reverseOrder());
        for (int i = 0; i < nums.length; i++) {
              pq.add(nums[i]);
        }
        while(pq.size() > nums.length - k + 1){
            pq.remove();
        }
        
        return pq.peek();
    }
}
// Time Complexity : O(log n)
// Space Complexity : O(n)
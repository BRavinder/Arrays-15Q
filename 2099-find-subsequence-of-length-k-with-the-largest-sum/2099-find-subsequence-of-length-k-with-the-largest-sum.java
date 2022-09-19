class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        int[] res = new int[k];
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>((o1, o2) -> nums[o2] - nums[o1]);
		// Creating heap : O(n)
        for (int i = 0; i < nums.length; i++)
            pq.add(i);
		// Extracting k indexes from the heap : O(k * log(n))
        for (int i = 0; i < k; i++)
            res[i] = pq.poll();
		// Sorting the results : O (k * log(k))
        Arrays.sort(res);
		// Replacing indexes with values : O(k)
        for (int i = 0; i < k; i++)
            res[i] = nums[res[i]];
        return res;
    }
}
// Time complexity : O(log n)
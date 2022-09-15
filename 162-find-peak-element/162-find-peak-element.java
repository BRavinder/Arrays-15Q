class Solution {
    public int findPeakElement(int[] nums) {
        int h = 0, l = nums.length - 1;
        while (h < l) {
            int mid = (h + l) / 2;
            if (nums[mid] > nums[mid + 1])
                l = mid;
            else
                h = mid + 1;
        }
        return h;
        
    }
}

//==>Time Complexity O(Logn)
//==>Space Complexity O(log n)

class Solution {
    public boolean divideArray(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int num = nums[i];
            if(!list.contains(num)){
                list.add(num);
                int c=0;
                for(int j=0;j<nums.length;j++){
                    if(nums[j]==num)
                        c++;
                }
                if(c%2!=0)
                    return false;
            }
        }
        return true;
    }
}
// time Complexity : O(n)
// Space Complexity : O(n)
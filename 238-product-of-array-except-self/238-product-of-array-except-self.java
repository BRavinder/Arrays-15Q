class Solution {
    public int[] productExceptSelf(int[] nums) {
       int[] har = new int[nums.length];
        
        int temp = 1;
        for(int i = 0; i < nums.length; i++){
            har[i] = temp;
            temp *= nums[i];
        }
        
        temp =1;
        for(int i = har.length-1; i >= 0; i--){
            har[i] *=  temp;
            temp *= nums[i];
        }
        
        return har;
    }
} 

//==>Time complexity o(n)
//==>space complexity o(1)
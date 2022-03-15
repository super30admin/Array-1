class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int target [] = new int[nums.length];
        int target1 [] = new int[nums.length];
        
        int product = 1;
        
        target[0] = 1;
        
        for(int i=1;i<nums.length;i++)
        {
            product = product*nums[i-1];
            target[i] = product;
            
        }
        
        product = 1;
        
        for(int i=nums.length-2;i>=0;i--)
        {
            product = product*nums[i+1];
            target[i] = product*target[i];
            
        }
        
        
        
        return target;
    }
}
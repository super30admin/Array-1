//238. Product of Array Except Self
//Time Complexity:O(n)
//Space Complexity:O(n)

class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int[] ans = new int[nums.length];
        //getting all the left side sums
        for( int i = 0; i < nums.length; ++i){
            if(i == 0)
                ans[i] = 1;
            else
                ans[i] = nums[i-1]*ans[i-1];
            
        }
        //iterating from the end and also modifying the ans array
        
        for( int i = nums.length-1; i >= 0; i--)   
            if(i == nums.length-1)
            {
                int temp = nums[i];
                nums[i] = ans[i];
                ans[i] = temp;
            } 
            else
            {   
                int temp = ans[i+1]*nums[i];                
                nums[i] = ans[i] * ans[i+1];    
                ans[i] = temp;
            }
    return nums;
    }
    
}

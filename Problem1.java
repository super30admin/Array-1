// 238. Product of Array Except Self


class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        if (nums == null || nums.length == 0)
        {
            return new int[0];
        }
        
        int temp = 1, rp = 1;
        int [] result = new int [nums.length];
        
        for ( int i = 0; i < nums.length; i++)
        {
            rp = rp * temp;
            result[i] = rp;
            temp =  nums[i];
        }
        
        temp = rp = 1;
        
        for ( int i = nums.length -1; i >= 0; i--)
        {
            rp = rp * temp;
            result[i] = result[i] * rp;
            temp =  nums[i];
        }
        
        return result;
        
    }
}

/*
Complexity analysis

Time complexity : 
O(N) where N represents the number of elements in the input array. We use one iteration to construct the array 
L, one to update the array answer.
Space complexity : 
O(1) since don't use any additional array for our computations.  
*/
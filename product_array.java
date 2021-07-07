class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        if(nums==null || len == 0)
        {
            return new int[0];
        }
        
        int[] left = new int[len];
        int[] right = new int[len];
        
        left[0] = 1;
        right[len-1] = 1;
        
        //left prod
        for(int i=1;i<len;i++)
        {
            left[i] = nums[i-1] * left[i-1];
        }
        
        //right prod
        for(int i=len-2;i>=0;i--)
        {
            right[i] = right[i+1] * nums[i+1];
        }
        
        //final prod
        for(int i=0;i<len;i++)
        {
            right[i] = right[i] * left[i];
        }
        
        return right;
        
    }
}

//runtime: O(n)
//space: O(n)---can be changed to O(1) by doing the whole calculation in the returning array with a help of a helper variable

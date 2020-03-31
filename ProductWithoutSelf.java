class Solution {
    
    //time - O(n)
    //space - constant
    public int[] productExceptSelf(int[] nums) {
        if(nums == null || nums.length == 0)
        {
            return new int[0];
        }

        int[] result = new int[nums.length];
        
        //running product * previous num
        //left pass
        result[0] = 1;
        int runningProduct = 1;
        for(int i = 1; i < nums.length; i++)
        {
            result[i] = runningProduct * nums[i - 1];
            runningProduct = result[i];
        }
        
        //right pass
        runningProduct = 1;
        for(int i = nums.length - 1; i >= 0; i--)
        {
            result[i] = result[i] * runningProduct;
            runningProduct = runningProduct * nums[i];
        }
        return result;
    }
    
    //extra space
    //space - O(n)
    time - O(n)
    public int[] productExceptSelfExtra(int[] nums) {
        if(nums == null || nums.length == 0)
        {
            return new int[0];
        }

        int[] result = new int[nums.length];
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        
        //running product * previous num
        //left pass
        left[0] = 1;
        for(int i = 1; i < nums.length; i++)
        {
            left[i] = left[i - 1] * nums[i - 1];
        }
        
        //right pass
        right[nums.length - 1] = 1;
        for(int i = nums.length - 2; i >= 0; i--)
        {
            right[i] = right[i + 1] * nums[i + 1];
        }
        
        for(int i = 0; i < nums.length; i++)
        {
            result[i] = left[i] * right[i];
        }
        return result;
    }
}

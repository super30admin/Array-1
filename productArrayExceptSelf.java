//time complexity: O(n)
//space complexity: O(1)
//executed on leetcode: yes
//approach: we iterate through the array and update the result array with the product of all elements before a particular index
//we update the same result array by multiplying the products on the right of an index.

class Solution {
    public int[] productExceptSelf(int[] nums) {
        if(nums.length==1) return new int[]{1};
        int left_product = 1;
        int[] result = new int[nums.length];
        result[0] = 1;
        for(int i=1;i<nums.length;++i)
        {
            result[i] = nums[i-1] * left_product;
            left_product = result[i]; 
        }
        int right_product = 1;
        for(int i=nums.length-2;i>=0;--i)
        {   
            result[i] = result[i] * (right_product * nums[i+1]);
            right_product = right_product * nums[i+1];
        }
        
        return result;
    }
}

/**
Using Extra arrays
class Solution {
    public int[] productExceptSelf(int[] nums) {
        if(nums.length==1) return new int[]{1};
        int left_product = 1;
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        left[0] = 1;
        for(int i=1;i<nums.length;++i)
        {
            left[i] = nums[i-1] * left_product;
            left_product = left[i]; 
        }
        right[nums.length-1] = 1;
        int right_product = 1;
        for(int i=nums.length-2;i>=0;--i)
        {
            right[i] = right_product * nums[i+1];
            right_product = right[i];
        }
        for(int i=0;i<nums.length;++i)
        {
            right[i] = right[i]*left[i];
        }
        
        return right;
    }
}
**/
// Time Complexity : O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode :
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach


class Product {
    public int[] productExceptSelf(int[] nums) {
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        left[0]=1;
        right[nums.length-1]=1;
        for(int i=1;i<nums.length;i++){  
            left[i] = nums[i-1]*left[i-1];
            
        }
        int prod = 1;
        int[] res = new int[nums.length];
        res[nums.length-1] = prod*left[nums.length-1];
        for(int i=nums.length-2;i>=0;i--){
            prod *= nums[i+1];
            res[i]= prod*left[i];
        }
        return res;
    }
}


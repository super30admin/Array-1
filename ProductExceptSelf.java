// Time Complexity : O(N)
// Space Complexity : O(1) i.e. constant
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
// First multiplying all the product of all the element in left except self at the current index
// Then doing the same but in right, thus at last we will have all the product except the index itself

// Your code here along with comments explaining your approach

public int[] productExceptSelf(int[] nums) {
    if(nums == null || nums.length == 0) return new int[]{};
    
    int[] result = new int[nums.length];
    //using running product here
    int rp=1;
    
    //for multiplying from left to right except self
    for(int i=0;i<nums.length;i++){
        result[i] = rp;
        rp = rp * nums[i];
    }
    
    //re-initializing the running product
    rp=1;
    
    //for multiplying the product from right to left
    for(int i=nums.length-1;i>=0;i--){
        result[i] *= rp;
        rp *= nums[i];
    }
    
    return result;
}
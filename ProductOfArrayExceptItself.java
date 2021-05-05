// Did this code successfully run on Leetcode : Yes 
// Any problem you faced while coding this : No

//Time Complexity : O(n) since we are iterating through the array couple of times 
//Space Complexity: O(1) since we are not taking any extra space and only using result array which will not be considered extra space

public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        
        int rProduct = 1;
        result[0] = 1;
        
        //Product of elements left to the current element
        for(int i = 1; i < nums.length; i++){
           rProduct = nums[i-1] * rProduct;
           result[i] = rProduct;
        }
        rProduct = 1;       
        //LeftProduct * Product of elements right to the current element
        for(int j = nums.length - 2; j >= 0; j--){
            rProduct = nums[j + 1] * rProduct; 
            result[j] = result[j] * rProduct;
        }
        
        return result;
}
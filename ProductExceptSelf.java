// Time Complexity : O(N) for left and right traversal
// Space Complexity : O(1) 
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no
// Three line explanation of solution in plain english: Calculate the product of the elements on the left of the current element 
//and multiply it with the product of elements on the right of the current element.

// Your code here along with comments explaining your approach

class ProductExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        
       //null cases
        if(nums.length  == 0  || nums == null){
            return new int[0];
        }
        
        int [] result = new int[nums.length];
        
        //for 1st element the product from left would be one
        result[0] = 1;
        
        //calculating running product from left for the current element [1, 1, 2,6]
        for(int i = 1 ; i < nums.length ; i++){
            result[i] = result[i-1] * nums[i - 1];
        }
        //Now multiply the running product from right with the calulated left
        
        int rightRP = 1; // for last element the running product would be 1
        
         for(int j = nums.length-2 ; j >=0  ; j--){
             rightRP = nums[j+1] * rightRP; // calculating right running product for the current element
            result[j] = result[j] * rightRP ; // multiplying right running product with left running product;
        }
        
        return result;
    }
}
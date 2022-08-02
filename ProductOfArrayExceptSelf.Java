// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english 

//1. We have to find the product of elements in an array except the current element
//2. Next, We will proceed with runningProduct = 1 for left side elements 
//3. Finally, We will proceed with runningProduct = 1, for right side elements 
//4. We will product for left runningProduct with right runningProduct elements 

// Your code here along with comments explaining your approach

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        
        
        int [] result = new int[n];
        
        if(nums == null || nums.length == 0) return result;
        
        int runningProduct = 1;
        result[0] = 1;
        
        //Left runningProduct 
        //nums = [1,2,3,4]
        for(int i=1; i<n;i++){ 
            runningProduct *= nums[i-1];
            result[i] = runningProduct;
        }

        //result = [1,1,2,6] //left runningProduct
        
        //System.out.println(Arrays.toString(result));
        
        //right runningProduct
        runningProduct = 1;
        for(int j=n-2; j>=0; j--){
            runningProduct = runningProduct*nums[j+1]; 
            result[j] = result[j] * runningProduct;
        }
        //nums = [1,2,3,4] 
        //result = [1,1,2,6] left
        
        // result = [24,12,4,1] 
        return  result;  
    }
}
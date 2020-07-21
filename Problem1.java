//
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

//  Approach 1: Brute force
// Time Complexity : O(n^2)
//      n: number of elements
// Space Complexity : O(1)
//      Not counting resultant array

class Problem1BruteForce {

    /** find product of except self */
    public int[] productExceptSelf(int[] nums) {

        // edge case
        if(nums==null || nums.length==0)
            return new int[]{0};
        
        // resultant array
        int result[] = new int[nums.length];
        
        // iterate all element
        for(int i=0;i<nums.length;i++){
            
            int temp = 1;
            
            // for elemnets not equal to self
            for(int j=0;j<nums.length;j++)
                if(i!=j)
                    temp *= nums[j];
            
            result[i] = temp;
        }
        
        // return result
        return result;
    }
}

// Approach 2
// Time Complexity :O(3n) = O(n)
//      n: number of elements
//      For left , right, Product of left right
// Space Complexity :O(2n) = O(n)
//      2n for left and right running sum

class Problem1Solution1 {
    
    /** find product except self */
    public int[] productExceptSelf(int[] nums) {
        
        // edge case
        if(nums==null || nums.length==0)
            return new int[]{0};
        
        // for left and right
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];

        // initial value before product ~ 0th position
        int runningSum =1;
        int temp= 1;

        // iterate
        for(int i=0; i<nums.length;i++){

            // product
            runningSum *= temp;
            left[i] = runningSum;

            // updating previous
            temp = nums[i];
           
        }
        
        // initial value before product ~ n-1 position
        runningSum=1;
        temp=1;

        // iterate
        for(int i=nums.length-1; i>=0;i--){
            
            // product
            runningSum *= temp;
            right[i] = runningSum;

            // updating previous
            temp = nums[i];
           
        }
        
        int result[] = new int[nums.length];
        // product of left and right
        for(int i=0; i<nums.length;i++){
            result[i] = left[i] * right[i];
        }
        
        // return result
        return result;
    }
}

// Approach 3: With constant space
// Time Complexity :O(2n) = O(n)
//      n: number of elements
//      For left and right
// Space Complexity : O(1)
//      here we don't count resultant array space
class Problem1Solution2 {
    
    /** find product except self */
    public int[] productExceptSelf(int[] nums) {
        
        // edge case
        if(nums==null || nums.length==0)
            return new int[]{0};
        
        // result
        int[] result = new int[nums.length];
    
        // before product
        int runningSum =1;
        int temp= 1;

        // iterate
        for(int i=0; i<nums.length;i++){
            
            // product
            runningSum *= temp;
            result[i] = runningSum;
            // update previous
            temp = nums[i];
           
        }
        
        // for n-1
        runningSum=1;
        temp=1;
        // iterate
        for(int i=nums.length-1; i>=0;i--){
            // product
            runningSum *= temp;
            result[i] *= runningSum; // taking direct product

            // update previous
            temp = nums[i];
           
        }

        // return result
        return result;
    }
}
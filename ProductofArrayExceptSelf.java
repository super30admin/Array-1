// Time Complexity : O(n) n is length of array
// Space Complexity : O(n) n is length of array using additional array to store the result
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english

1. get product of all the elements on the left of a index (element) - do it for all the elements
2. get the product of all the elements on the right of a index and multiple it with the product of left elements and save it -do it for all elements
3. maintain an array to store the products and return it


// Your code here along with comments explaining your approach

class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int runningValue = 1;
        int[] arr = new int[nums.length];
        
        for(int i = 0; i < nums.length; i++)
        {
            if(i==0)
            arr[i] = 1;
            else
            { 
                runningValue = runningValue * nums[i-1];
                arr[i] = runningValue;
             }
            
        }
        runningValue =1;
        for(int i = nums.length-1; i >= 0; i--)
        {
            if(i==nums.length-1)
            arr[i] = arr[i]* 1;
            else
            { 
                runningValue = runningValue * nums[i+1];
                arr[i] = arr[i] * runningValue;
             }
            
        }
        return arr;
    }
}
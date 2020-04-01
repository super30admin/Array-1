// Time Complexity : O(n) n=number of elements in array. 
// Space Complexity : O(1) return response not additional data structure.  
// Did this code successfully run on Leetcode :yes. 

// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
// Using the pattern of calculation from left to right, then store in response, after than traverse input from right to left and multiply per output array.
//Runtime: 1 ms, faster than 100.00% of Java online submissions for Product of Array Except Self.
//Memory Usage: 48.1 MB, less than 5.51% of Java online submissions for Product of Array Except Self.

     public int[] productExceptSelf(int[] nums) {
       if (nums==null|| nums.length==0)
           return new int[0];
       int[] answer = new int[nums.length];
       answer[0] = 1;
       int prod=1;
        for(int i = 1; i < nums.length; i++) {
            prod*=nums[i - 1];
            answer[i]=prod;
        }
        prod = 1;
        for(int i = nums.length - 1; i >= 0; i--) {
            prod *= (i+1)>=nums.length?1:nums[i+1];
            answer[i] *= prod;
        }
        return answer;
    }
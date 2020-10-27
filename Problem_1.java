// Time Complexity :O(n) + O(n) + O(n) = O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No


class Solution {
    public int[] productExceptSelf(int[] nums) {
        
       int temp =1;
        // each element in array equal to product of all elements to its left
        int[] left = new int[nums.length];
         // each element in array equal to product of all elements to its right
        int[] right = new int[nums.length];
        
        int[] res = new int[nums.length];
        
        left[0] = 1;
        // populate left product array
        for(int i=1;i<nums.length;i++){
            temp = temp*nums[i-1];
            left[i]=temp;
            
        }
        
        temp =1;
        // populate right product array
        right[nums.length-1]=1;
        for(int j =nums.length-2;j>=0;j--){
            temp = temp*nums[j+1];
            right[j]=temp;
        }
        
        // multiple each element from left and right arrays
        for(int i=0;i<nums.length;i++){
            
            res[i] = left[i]*right[i];
            
        }
        
        
        
       
        return res;
    }
}
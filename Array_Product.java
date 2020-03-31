// Time Complexity : O(n) where n is the number of elements
// Space Complexity :O(n) where n is the number of elements
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        
        int[] temp1 = new int[nums.length];
        int[] temp2 = new int[nums.length];
        
        temp1[0] = 1;
        temp2[nums.length -1] = 1;
        
        for(int i = 0; i < nums.length-1; i++){
            temp1[i+1] = temp1[i]*nums[i];
        }
        
        for(int j = nums.length-1; j > 0; j--){
            temp2[j-1] = temp2[j]*nums[j];
        }
        
        for(int k = 0; k < nums.length; k++){
            result[k] = temp1[k]*temp2[k];
        }
        
        return result;
    }
}
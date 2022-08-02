//TC: O(n) ierating through given array
//SC: O(1) res_left is not considered as extra space as it was given as output [Let me know if this was correct]
// Leetcode : successful
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int rm = 1;
         int [] res_left = new int [nums.length];
        if(nums==null || nums.length==0)
            return res_left;
        res_left[0] = 1;
        for(int i =1; i< nums.length;i++){
            rm = rm*nums[i-1];
            res_left[i] = rm;
            //System.out.print(rm+ " ");
        }
        System.out.print(Arrays.toString(res_left));
        
        rm =1;
        for(int i=nums.length-2;i>=0;i--){
            rm = rm*nums[i+1];
            
             res_left[i] = res_left[i]*rm;
            //System.out.print(rm+ " ");
        }
        return res_left;
    }
}
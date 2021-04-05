// Time Complexity :O(n) n is length of nums
// Space Complexity :O(n) if output array is considered
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english
//find the left product and right product of every element in the array and result would be product of them.
// Your code here along with comments explaining your approach
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int rprod=1;
        int[] res = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            res[i] =rprod;
            rprod=rprod*nums[i];
        }
        rprod=1;
        for(int i=nums.length-1;i>=0;i--){
            res[i] =res[i]*rprod;
            rprod=rprod*nums[i];
        }
        return res;
    }
}
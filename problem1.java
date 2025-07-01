// Time Complexity : O(n)
// Space Complexity : O(1) as the problem states that "The output array does not count as extra space for space complexity analysis."
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english: I made a count of zeros, if we have 2 or more zeroes, the product will be 0 for all. I also made a product which is basically the product of all the elements, for ith index, the product will be product of all/ this element. Also, if we have only one zero, all elements will be 0 except for the index which has a 0 - this value would be the product excluding 0.

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int ctZero = 0;
        int prod = 1;
        int [] res = new int[nums.length];
        for(int i = 0; i<nums.length; i++){
            if(nums[i]==0){
                ctZero++;
                if(ctZero==2) return res;
                continue;
            }
            prod*=nums[i];
        }
        for(int i = 0; i<nums.length; i++){
            if(ctZero==1){
                if(nums[i]==0) res[i] = prod;
                else res[i]=0;
            }
            else res[i] = prod/nums[i];
        }
        return res;
    }
}
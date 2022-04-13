// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english: 
I will stroe the left product and the right produt of for every element in the array. first we will calculate the left running sun for every element and store it in the array and then we will multiply element in the aaray with the running product of the elements to the rgiht of the initial array.

// Your code here along with comments explaining your approach

class Solution {
    public int[] productExceptSelf(int[] nums) {
        if(nums==null||nums.length==0)
            return new int[]{};
        int [] ans = new int[nums.length];
        ans[0] = 1;
        int rProd = 1;
        for(int i =1;i<nums.length;i++){
            rProd = rProd*nums[i-1];
            ans[i] = rProd;
        }
        rProd = 1;
        for(int i = nums.length-2;i>=0;i--){
            rProd = rProd*nums[i+1];
            ans[i] = ans[i]*rProd;
        }
        return ans;
    }
}
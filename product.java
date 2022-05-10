// Time Complexity :O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english 
// iterate through the two array one forward and one back  and calculate the rsum and multiply 

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int nums_size = nums.length;
        int[] result = new int[nums_size];
        int rprod = 1;
        result[0]=1;
        for(int i=1; i<nums.length;i++){
            rprod*=nums[i-1];
            result[i]=rprod;
        }
        rprod=1;
        for(int i= nums_size-2; i>=0; i--){
            rprod*=nums[i+1];
            result[i]*= rprod;
        }
        return result;
    }
}
// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

class Solution {
    public int[] productExceptSelf(int[] nums) {
        if(nums==null || nums.length==0){
            return new int[] {};
        }

        int n=nums.length;
        int[] answer =new int[n];
        int rp=1;

        answer[0]=rp;
        for(int i=1;i<n;i++){
            rp=rp*nums[i-1];
            answer[i]=rp;
        }
        rp=1;

        for(int i=n-2;i>=0;i--){
            rp=rp*nums[i+1];
            answer[i]=answer[i]*rp;
        }
        return answer;
    }
}
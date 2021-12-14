// Time Complexity :O(N)
// Space Complexity :O(N)
// Did this code successfully run on Leetcode :Yes
// Three line explanation of solution in plain english

//Take product of the elemnts in the array from left to right and maintain a running product of the elements.
//Keep adding as we traveres from right to left again

class Solution {
    public int[] productExceptSelf(int[] nums) {
        if(nums == null || nums.length==0 )return new int[]{};

        int rp = 1;
        int n = nums.length;
        int[] answer = new int[n];
        answer[0] = rp;
        for(int i = 1;i<n;i++){
            rp = rp * nums[i-1];
            answer[i] = rp;
        }
        rp =1;
        for(int j =n-2;j>=0;j--){
            rp = rp * nums[j+1];
            answer[j] = answer[j]*rp;
        }
        return answer;
    }
}
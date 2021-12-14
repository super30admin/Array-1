// Time Complexity :O(n)
// Space Complexity :O(1); since we are returning the array space that is consumed.
// Did this code successfully run on Leetcode : Yes
/*Approach - take the running sum of the elements towards the left and store it in the array and
 then multiply the corresponding running product from the right to each element in that array.*/

class Solution {
    public int[] productExceptSelf(int[] nums) {
        if(nums==null||nums.length==0)
            return new int[]{};
        int[] answer=new int[nums.length];
        int rp=1;
        answer[0]=rp;
        for(int i=1;i<nums.length;i++){
            rp=rp*nums[i-1];
            answer[i]=rp;
        }
        rp=1;
        for(int i=nums.length-2;i>=0;i--){
            rp=rp*nums[i+1];
            answer[i]=answer[i]*rp;
        }
        return answer;
    }
}
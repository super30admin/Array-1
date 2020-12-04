// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

// There are 2 approach for this 1st is by creating 2 arrays Left and Right 
// Left containing prodect of elements to the left of the certain element
// Right containg product of elements to the right of the certain elements
// Since Space Complexity comes out to be O(N)
// So we can maintain only one array i.e Left and now multiply it with the right element traversing it

// Your code here along with comments explaining your approach
class Solution {
    public int[] productExceptSelf(int[] nums) {
        if(nums == null || nums.length == 0){
            return new int[0];
        }
        int temp = 1, rp = 1;
        int[] result = new int[nums.length];
        //Forward run from left
        for(int i = 0; i< nums.length; i++){
            rp = rp * temp;
            result[i] = rp;
            temp = nums[i];
        }
        temp = rp = 1;
        //Backward Run from right
        for(int i=nums.length-1;i>=0; i--){
            rp=rp*temp;
            result[i] = result[i] * rp;
            temp = nums[i];
        }
        return result;
    }
}
// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english
  //create return array,
  //moving from left to right update index with running product except self.
  //do the same from right to left in the same ret array but this time
  //multiply the prev values with new running products.

// Your code here along with comments explaining your approach

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int pro = 1;
        int ret[] = new int[nums.length];

        //walking from left to right.
        for(int i = 0 ; i < nums.length; i++){
            ret[i] = pro;
            pro = pro * nums[i];
        }

        //walking from right to left.
        pro = 1;
        for(int i = nums.length -1 ; i >= 0; i--){
            ret[i] = pro * ret[i];
            pro = pro * nums[i];
        }
        return ret;
    }
}

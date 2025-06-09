// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english - create array and array[i] maintain product of all elements in input array until i-1
// Maintain a variable right which at given i has product of elements in input array from indices i+1 to end. Compute product of left[i] with value 
// of right at index i. return the computed array
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int left[] = new int[nums.length];
        left[0] = 1;
        for(int i=1;i<nums.length;i++){
            left[i] = left[i-1] * nums[i-1];
        }
        int right = 1;
        for(int i=nums.length-1;i>=0;i--){
            left[i] = left[i]*right;
            right = right * nums[i];
        }
        return left;
    }
}
/**
Problem: https://leetcode.com/problems/product-of-array-except-self/
TC: O(n)
SC: O(1)
*/
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int answer[] = new int[nums.length];
        
        answer[0] = 1;
        
        for (int i = 1; i < nums.length; ++i) {
            answer[i] = answer[i-1] * nums[i-1];
        }
        
        int R = 1;
        
        for (int i = nums.length - 1; i >= 0; --i) {
            answer[i] = answer[i] * R;
            R = nums[i] * R;
        }
        
        return answer;
    }
}
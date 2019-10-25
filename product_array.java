class Solution {
    public int[] productExceptSelf(int[] nums) {

       int length = nums.length;
       int[] answer = new int[length];
        answer[0] = 1;
        for (int i = 1; i < length; i++) {
         answer[i] = nums[i - 1] * answer[i - 1];
        }

        int R = 1;
        for (int i = length - 1; i >= 0; i--) {
          answer[i] = answer[i] * R;
            R *= nums[i];
        }

        return answer;
    }
}
//TC O(n)
//SC O(1)
//improved
//Leetcode:  accepted

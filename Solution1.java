// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach


class Solution1 {

    public int[] productExceptSelf(int[] nums) {
        // The length of the input array
        int length = nums.length;

        // Final answer array to be returned
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
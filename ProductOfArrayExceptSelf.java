// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes

class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {

        int left[] = new int[nums.length];
        int right[] = new int[nums.length];

        int answer[] = new int[nums.length];

        left[0] = 1;
        right[nums.length - 1] = 1;

        for(int i = 1; i < nums.length; i++)
        {
            left[i] = left[i-1] * nums[i-1];
        }

        for(int i = nums.length - 2; i >= 0; i--)
        {
            right[i] = right[i+1] * nums[i+1];
        }

        for(int i = 0; i < nums.length; i++)
        {
            answer[i] = left[i] * right[i];
        }

        return answer;

    }
}
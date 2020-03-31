// Time Complexity : O(n)
// Space Complexity : O(n) // O(1) if we consider answer is not a part of space complexity
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

public class ProductOfArrayExeptSelf {
    // Here, we first start from index = 0 and calculate product of every number with the prev number and store it in answer.
    // Then, we start from the end, and do the same in reverse manner.
    // The output is what we expect
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;

        int[] answer = new int[n];

        answer[0] = 1;
        for(int i = 1; i < n; i++){
            answer[i] = answer[i-1] * nums[i-1];
        }

        int R = 1;
        for(int i = n-1; i>=0; i--){
            answer[i] = answer[i] * R;
            R *= nums[i];
        }

        return answer;
    }

    public static void  main(String args[]){
        int[] nums = new int[]{1,2,3,4};
        int[] answer = productExceptSelf(nums);

        for(int i : answer){
            System.out.println(i);
        }
    }
}

// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english
/*
calculated product increasingly from left side and then in second pass while
returning the product started calclualting from right and multiplying it.
We only maintain one array that is returned and since we need only the last product
we can maintain just one variable for right side and hence no extra space
*/
// Your code here along with comments explaining your approach


class Solution {
    public int[] productExceptSelf(int[] nums) {

        if(nums.length == 1) return nums;

        int[] leftproduct = new int[nums.length];

        int right = 1;

        leftproduct[0] = 1;

        for(int i = 1; i < nums.length; i++){
            leftproduct[i] = leftproduct[i-1] * nums[i-1];
        }

        for(int i = nums.length-2; i >=0; i--){
            right *= nums[i+1];
            leftproduct[i] *= right;
        }

        return leftproduct;
    }
}

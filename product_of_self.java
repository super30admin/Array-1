// Time Complexity :O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

public int[] productExceptSelf(int[] nums) {
    if(nums == null || nums.length == 0) return new int[0];
    int[] ans = new int[nums.length]; //output array
    int left = 1;
    //for every index, find the product of elements to it's left and to it's right and multiply them
    //to get the output result

    //Calculating the product of the left side elements for every element at that index. 
    for (int i = 0; i < nums.length; i++) {
        ans[i] = left;
        left *= nums[i];
    }
    
    //we can avoid taking an extra right array as the elements in the right array are results of
    //an individual operstion. We don't need previous values to calculate the current element of the right
    //array
    int right = 1;
    for (int i = nums.length - 1; i >= 0; i--) {
        ans[i] *= right;
        right *= nums[i];
    }
    
    return ans;   
}
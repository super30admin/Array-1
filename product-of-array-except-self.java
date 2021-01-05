// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english : No

// Your code here along with comments explaining your approach
// start from 0 and  mutiply everything in array before the element and
// start from end and multiply everything till element.

public int[] productExceptSelf(int[] nums) {
    
    int mul = 1;
    int nums1[] = new int[nums.length];
    for(int i = 1; i<nums.length; ++i){
        mul*=nums[i-1];
        nums1[i] = mul;
    }
    int mul1 = 1;
    int temp = nums[nums.length-1];
    for(int i = nums.length-2; i>=0; --i){
        mul1*=temp;
        temp = nums[i];
        nums[i] = mul1;
    }
    for(int i = 1; i<nums.length-1; ++i){
        nums1[i] *= nums[i];
    }
    nums1[0] = nums[0];
    return nums1;
}
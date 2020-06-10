// Time Complexity : O(n) --> where n is length of input array
// Space Complexity : O(1)
// Did this code successfully run on Leetcode (238): Yes
// Three line explanation of solution in plain english: In this problem, for each item in given array, we are computing products of numbers which belongs to the left side of that item. We then mutate the same array by computing (for each item) the products of numbers which belongs to the right side of that item and the value stored previously at the item. This gives us the final array. 

// Your code here along with comments explaining your approach

class Solution {
    public int[] productExceptSelf(int[] nums) {
        if (nums == null || nums.length == 0) return new int[0];
        
        int rProd = 1;
        int temp = 1;
        int arr[] = new int [nums.length];
        
        for (int i = 0; i < arr.length; i++) {
            rProd = rProd * temp;
            temp = nums[i];
            arr[i] = rProd;
        }
        
        rProd = 1;
        temp = 1;
        
        for (int i = arr.length - 1; i >= 0; i--) {
            rProd = rProd * temp;
            temp = nums[i];
            arr[i] *= rProd;
        }
        
        return arr;
    }
}
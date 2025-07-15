// Time Complexity : O(n)
// Space Complexity : O(1) extra space (excluding the output array)
// We use the output array to store results, and use only a couple of variables (lp) for computation.
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
// Your code here along with comments explaining your approach:
// First, I store the product of all elements to the left of each index in the output array.
// Then, I go from right to left, and multiply the existing output value with the product of elements to the right.
// This gives the final result where each element is the product of all other elements except itself.


import java.util.Arrays;

public class ProductExceptSelf {
    public int[] solve(int[] nums){
        if(nums==null || nums.length==0){
            return new int[] {};
        }
        int n = nums.length;
        int lp=1;
        int [] arr = new int[n];
        arr[0] = lp;
        for(int i=1; i<n; i++){
            lp = lp * nums[i-1];
            arr[i] = lp;
        }
        lp=1;
        for(int i=n-2;i>=0;i--){
            lp = lp * nums[i+1];
            arr[i] = arr[i]*lp;

        }
    
        return arr;
    }
    public static void main(String[]args){
        ProductExceptSelf ob = new ProductExceptSelf();
        int[] nums1 = {1,2,3,4};
        int[] nums2 = {-1,1,0,-3,3};
        System.out.println("Product of array except self is : "+ Arrays.toString(ob.solve(nums1)));
        System.out.println("Product of array except self is : "+ Arrays.toString(ob.solve(nums2)));
        
    }
    
}

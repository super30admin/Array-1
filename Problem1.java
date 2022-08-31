// Time Complexity : O(N)
// Space Complexity : O(1) , we are not using any extra space beside the output space
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
/*
For this product problem, we are taking the product to the left of element(excluding the current position), and then multiplying
the product with the right products .
We are returning thr result array that is the product of left and right elements
 */



// Your code here along with comments explaining your approach
public class Problem1 {

    public int[] productExceptSelf(int[] nums) {

        int n = nums.length;

        int[] result = new int[n];

        result[0] =1;
        //running product
        int rp =1;

        //calculating product from left side
        for(int i=1; i<n; i++){

            //left side product
            rp = rp* nums[i-1];
            result[i]= rp;
        }

        //calculating right side product and multiplying it with            the running product
        //starting from index n-2 as at n-1 it would be 1
        //updating the running product
        rp = 1;
        for(int i=n-2; i>=0; i--){

            //number to the right
            rp *= nums[i+1];
            result[i] = rp *result[i];

        }
        return result;
    }
}

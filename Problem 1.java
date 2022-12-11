// Time Complexity :O(n)
// Space Complexity :O(1) the space used is only for output
// Did this code successfully run on Leetcode :yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

/*
One way is to go from left to right, at each index we will have a running product and then in the answer array we can divide that element at that index to take the produce of all element except that.... but divide operation is not allowed

Another way is to calculate the product at any specific index is by taking element at that index and multiply that with every other element in the array except that element, but then that would give the n^2 runtime.

The intuition is that for getting a product at any index ,we need to get the product of all elements on its left , and product of all elements on its right and then take product of them
*/

class Solution {
    public int[] productExceptSelf(int[] nums) {

        int result[] = new int[nums.length];

        int rp =1;
        // the value at first index for the left product is always going to be 1
        result[0] = 1;
        // calculating left product
        for(int j = 1; j<result.length;j++){ //O (N)
        result[j] =  rp * nums[j-1];
        rp = result[j];
        }
        // calculate right product 
        // we will not use any additional array to store the right product , we would calculate on the fly and multiply with left on the result array
        rp = 1;
        for(int j=result.length-2;j>=0;j-- ){ // O (N)

            rp = rp * nums[j+1];
            result[j] = result[j] * rp;
        }

        return result;

    }
}
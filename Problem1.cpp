//Time Complexity : O(N)
// Space Complexity  O(N)
// Did this code successfully run on Leetcode : YES
// Three line explanation of solution in plain english:

//The code initializes a result vector of the same size as the input array and sets the first element to 
//1. It then calculates the product of all elements to the left of each element in the input array and stores it in the result vector.
//Next, it calculates the product of all elements to the right of each element in the input array and updates the result vector by multiplying the previously computed left product with the right product.
//Finally, the updated result vector is returned, containing the product of all elements except the one at the current index in the input array.


// Your code here along with comments explaining your approach



class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {
       int n = nums.size();
        int rp = 1;
        vector<int> result(n, 0);
        result[0] = 1;

        for (int i = 1; i < n; i++) {
            rp *= nums[i - 1];
            result[i] = rp;
        }

        rp = 1;

        for (int i = n - 2; i >= 0; i--) {
            rp *= nums[i + 1];
            result[i] *= rp;
        }
        return result;
    }
};
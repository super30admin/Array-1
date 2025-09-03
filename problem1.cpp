// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
// First, we go over the array from left to right to find the left running product
// Then we go over the array from right to left, maintaining a right running product
// The product of an array except a particular element will be the left product (existing result array) * right product

class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {
        int n = nums.size();
        vector<int> result(n);
        result[0] = 1;
        int leftProduct = 1; // left running product
        for(int i=1; i<n; i++) {
            leftProduct = leftProduct*nums[i-1];
            result[i] = leftProduct;
        }
        int rightProduct = 1; // right running product
        for(int i=n-2; i>=0; i--) {
            rightProduct = rightProduct*nums[i+1];
            result[i] = result[i]*rightProduct; 
        }
        return result;
    }
};
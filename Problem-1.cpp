//I used output array as left and right array 
//TC =O(n)
//S.C = O(1)
class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {
        int n = nums.size();
        vector<int>output(n, 1);
        
        int left_product = nums[0];
        for(int i = 1; i < n; i++){
            output[i] = left_product;
            left_product *= nums[i];
        }
        
        int right_product = nums[n - 1];
        for(int i = n - 2; i >= 0; i--){
            output[i] *= right_product;
            right_product *= nums[i];
        }
        return output;
    }
};
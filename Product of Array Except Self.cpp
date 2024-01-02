//238. Product of Array Except Self

/*
Do postfix and postfix multiplication
First, traverse from start to end by multiplying all the prev elements
Second, traverse from end to start by multiplying all prev elements and itself

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {

        int n = nums.size();
        int rp = 1;
        vector<int> res(n);
        res[0]=1;

        for(int i=1; i<n;i++){
            rp *= nums[i-1];
            res[i] = rp;
        }

        rp =1;
        for(int i=n-2; i>=0; i--){
            rp *= nums[i+1];
            res[i] *= rp;
        }

        return res;
    }
};
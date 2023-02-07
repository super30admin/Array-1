class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {
        int rp =1;
        vector<int> prodArray(nums.size());
        if (nums.size() == 0 ){
            prodArray.push_back(0);
            return prodArray;
        }
        prodArray[0]=rp;

        for (int i =1; i< nums.size(); i++){
            rp *= nums[i-1];
            prodArray[i] =rp;
        }
        rp =1;
        for( int i= nums.size() -2; i >=0; i-- ){
            rp *= nums[i+1];
            prodArray[i] = rp * prodArray[i];
        }
        return prodArray;
    }
};

// Time complexity : O(n)
// Space complexity: O(1)
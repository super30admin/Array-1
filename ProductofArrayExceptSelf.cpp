class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {

        vector<int> result(nums.size());

    if(nums.size() == 0) return result;

        result[0] = 1;
        int rp = 1;

        //left part
        for(int i = 1 ; i < nums.size() ; i++)
        {
            rp = rp * nums[i - 1];
            result[i] =  rp;
        }
           
        //right part
        rp = 1;
        for(int i = nums.size() - 2 ; i >= 0 ; i--)
        {
            rp = rp * nums[i + 1];
            result[i] = result[i] * rp;
        }

    return result;

    }
};
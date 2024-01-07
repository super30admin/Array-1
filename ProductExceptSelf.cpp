// Time Complexity : O(n)
// Space Complexity : O(1) as output is not considered as extra space
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No
#include <vector>
using namespace std;
class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {

        vector<int>result(nums.size());
        int rProd =1;
        result[0]=1;
        for(int i = 1; i<nums.size();i++)
        {
            rProd*=nums[i-1];
            result[i]=rProd;
        }
        rProd = 1;
        for(int i = nums.size()-2; i>=0;i--)
        {
            rProd*=nums[i+1];
            result[i]*=rProd;
        }
        return result;
        
    }
};
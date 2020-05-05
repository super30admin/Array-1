// Time Complexity : O(2n) since 2 passes
// Space Complexity : O(2n) left and right  
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
// 1. Maintain two arrays left and right. First element of left and last of right is set to 1 
// 2. Left array consists of product of every element so far to the left and right contains the same for right
// 3. Final result is element-wise product of left and right


class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {
        vector<int> left, right,result;
        left.reserve(nums.size());
        right.reserve(nums.size());
        result.reserve(nums.size());
        for (int i=0;i<nums.size();i++){
            left[i]=0;
            right[i]=0;
        }
        left[0] = 1;
        right[nums.size()-1] = 1;
        cout<<"el: "<<nums.size()-1<<endl;
        for (int i=1; i<nums.size(); i++)
            left.emplace_back(left[i-1]*nums[i-1]);
        for(int i = nums.size()-2; i>=0; i--)
            right.back() = right[i+1]*nums[i+1];
        
        for(int i=0;i<nums.size();i++)
            result[i] = left[i]*right[i];
        
        return result;
        
    }
};
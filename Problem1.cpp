// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {
        vector<int> res;
        if(nums.size()==0) return res;
        int arr[nums.size()];
        //fill the running product of the array except self from left
        int temp=1;
        int prod=1;
        vector<int> left_arr;
        for(int i=0; i<nums.size(); i++){
            prod = temp*prod;
            temp = nums[i];
            left_arr.push_back(prod);
        }
        
        //fill the running product of the array except self from left
        reverse(nums.begin(), nums.end());
        vector<int> right_arr;
        prod=1; temp=1;
        for(int i=0; i<nums.size(); i++){
            prod = temp*prod;
            temp = nums[i];
            right_arr.push_back(prod);
        }
        
        reverse(right_arr.begin(), right_arr.end());
        
        //result array
        for(int i=0; i<left_arr.size(); i++){
            res.push_back(left_arr[i]*right_arr[i]);
        }
        
        return res;
    }
};

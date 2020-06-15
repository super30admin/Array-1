// Time Complexity : O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : YES 

class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {
        vector<int> rtemp;
        for(int i=0; i<nums.size(); i++){
            if(i==0){
                rtemp.push_back(1);
            }
            else{
                int t = rtemp.at(i-1) * nums.at(i-1);
                rtemp.push_back(t);
            }
        }
        int ltemp[nums.size()];
        for(int i=nums.size()-1; i>=0; i--){
            if(i==nums.size()-1){
                ltemp[i] = 1;
            }
            else{
                int t = ltemp[i+1] * nums.at(i+1);
                ltemp[i] = t;
            }
        }
        for(int i =0; i<nums.size();i++){
            nums[i] = ltemp[i] * rtemp[i];
         }
        return nums;
    }
};
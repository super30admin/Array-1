//Time Complexity- O(n)
//Space Complexity- O(1)

class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {
        
        vector<int> output(nums.size(),0);
        
        output[0]=1;
        for(int i=1;i<nums.size();i++){
            output[i]=output[i-1]*nums[i-1];
        }
        
        int r=1;
        for(int i=nums.size()-1;i>=0;i--){
            output[i]=r*output[i];
            r=r*nums[i];
        }
        
        return output;
    }
};
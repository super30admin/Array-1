//Time Complexity - O(N)
//Space Complexity - O(1)

class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {
        long long int rp=nums[nums.size()-1];
        vector<int>v;
        v.push_back(1);
        for(int i=1;i<nums.size();i++){
            v.push_back(v[i-1]*nums[i-1]);
        }
        for(int i=nums.size()-2;i>=0;i--){
            v[i]=rp*v[i];
            rp*=nums[i];
        }
        return v;
    }
};
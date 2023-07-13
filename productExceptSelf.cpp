#include <iostream>
#include <vector>

using namespace std;

class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {

        int n=nums.size();
        int rp = 1;
        vector<int> rNums(nums.size());
        rNums[0]=1;

        for(int i=1;i<n;i++){
            rp=rp*nums[i-1];
            rNums[i]=rp;


        }

        rp=1;
        

        for(int i=n-2;i>=0;i--){
            rp=rp*nums[i+1];
            rNums[i]=rNums[i]*rp;
         

        }

        return rNums;

       

            
    }
};
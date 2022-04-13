// time : o(n)
// space : o(n)
class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {
        
        
        int rsum = 1;
        int n =  nums.size();
        
        vector<int> preFixSums(n);
        preFixSums[0] = 1;
        
        for(int i = 1;i<n;i++) {
            rsum = rsum * nums[i-1];
            preFixSums[i] = rsum;
        }
        
        
        rsum = 1 ;
        for(int i = n-2; i>=0; i--) {
           rsum = rsum *nums[i+1] ;
            preFixSums[i] = preFixSums[i] *rsum;
        }
        
        return preFixSums;
        
    }
};
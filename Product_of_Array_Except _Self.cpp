class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {
        int n = nums.size();
        vector<int> results(n);
        results[0]=1;
        int rp = 1;
        for(int i=1;i<n;i++){ //left pass(products of left side elements of the  current index)
            rp = rp *nums[i-1];
            results[i]=rp;
        }
        rp=1;
        for(int i=n-2;i>=0;i--){
            rp = rp * nums[i+1];
            results[i]= (results[i]*rp);
        }

    return results;
    }
};

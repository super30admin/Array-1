   //TC-O(N)
    //SC-O(N)
    vector<int> productExceptSelf(vector<int>& nums) {
       int n=nums.size();
        vector<int> res(n);
        vector<int> left(n);
        vector<int> right(n);
       
        left[0]=1;
    
        for(int i=1;i<nums.size();i++){
            left[i]=left[i-1]*nums[i-1];
        }
        int rightprod=1;
        for(int i=n-1;i>=0;i--){
            res[i]=rightprod*left[i];
            rightprod=rightprod*nums[i];
        }
        return res;
    }
class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {
      
       //  Trail Method
       
        // int n = nums.size();
        // int ans[n];
            // int prod = 1;
            //  vector<int> ans(n,1);
            // ans[0] =1;

        // for(int i = 0;i<n;i++){
        //     for(int j=0;j<n;j++)
        //     {
        //         if(i==j){
        //             continue;
        //         }
        //         else{
        //             prod = prod*nums[j];
        //         }
        //     }

        //     ans.push_back(prod);
        //     prod = 1;
        // }

        // return ans;


   

// ANS:- 


        int n = nums.size();
        int prod = 1;
        vector<int> ans(n, 1);
        
        for(int i = 1; i < n; i++){
         ans[i] = ans[i-1] * nums[i-1];
         
        }
        
        for(int i = n-2; i >= 0; i--){
            prod =  prod* nums[i+1];
            ans[i] = ans[i]*prod;
        }
        
        return ans;
    }
};
class Solution {
   // Time COmplexity : O(n)
   // Space Complexity : O(1) 
public:
    vector<int> productExceptSelf(vector<int>& nums) {
        int n = nums.size();
        vector<int> output1(n,0);
        // vector<int> suffix(n,0);
        int temVar =nums[n-1];
        output1[0]= nums[0];
        for(int i=1; i<n;i++){
            output1[i] = output1[i-1]*nums[i];  
        }
        // for(int i=n-2; i>=0;i--){
        //     suffix[i] = suffix[i+1]*nums[i];  
        // }
        output1[n-1]= output1[n-2];
        for(int i=n-2; i>0;i--){
            output1[i] = output1[i-1]*temVar;
             temVar = temVar*nums[i];
        }
        output1[0]=temVar;
      return output1;

    }
};
class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {
     
        vector<int> res(nums.size());
        
        vector<int> left(nums.size());
        vector<int>right(nums.size());
        
        left[0]=1;
        right[nums.size()-1]=1;
        for(int a=1;a<nums.size();a++)
        {
            left[a]=nums[a-1]*left[a-1];
        }
        for(int b=nums.size()-2; b>=0; b--)
        {
            right[b]=right[b+1]*nums[b+1];
        }
        
       for(int c=0;c<nums.size();c++)
       {
           res[c]=left[c]*right[c];
       }
        return res;
    }
};

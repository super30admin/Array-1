class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {
        vector<int>result;
        result[0]=1;
        for(int i =1;i<nums.size();i++) // calculate the left product for each element
        {
          result[i]= result[i-1]*nums[i-1];
        }
        int right = 1; // to calculate right product for each element and put in result array 
        for(int i=result.size()-1;i>=0;i++)
        {
           result[i]=result[i]*right;
           right = right*nums[i];
           i--;
        }

        return result;
    }
};
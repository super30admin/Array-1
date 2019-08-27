/*Time Complexity : O(n)
Space Complexity : O(1) // since output array doesn't count.
Did it run on LeetCode : Yes
*/

class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {
        int size=nums.size();
        vector<int> result(size);
        int temp=1;
        int runningProduct=1;
        
        //ForLoop for the forward Pass.
        for(int i=0;i<size;i++)
        {
            runningProduct=runningProduct*temp; 
          result[i]=runningProduct;
            temp=nums[i];
        }
        
        //for backward pass.
        temp=1;
        runningProduct=1;
        
        for(int i=size-1;i>=0;i--)
        {
            runningProduct=runningProduct*temp;
             result[i]=result[i]*runningProduct;
            temp=nums[i];
        }
        
        return result;
    }
};
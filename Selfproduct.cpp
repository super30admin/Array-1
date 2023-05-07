// Runned on leetcode: yes
// TC:O(N),SC:O(N)
// Approach
// Used an extra array to store the product of all the elements on the left
// And then I will traverse that left array in reverse order updating each element with the product



class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {


        vector<int>left(nums.size(),1);
        int rp=nums[0];  
        // filling array with left elements product
        for(int i=1;i<nums.size();i++)
        {                                                                                                               
            left[i]=rp;
            rp=rp*nums[i];
        }
        
        rp=nums[nums.size()-1];
        // reverse traversal
        for(int i=nums.size()-2;i>=0;i--)
        {
            left[i]=left[i]*rp;
            rp=rp*nums[i];
        }

        return left;
        
    }
};
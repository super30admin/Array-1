//Time complexity: O(n)
//Space complexity: O(1)

//Appraoch here is that we find product of left and right numbers for number in considerarion, in the end we take product of the numbers in left and right array

class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {
        vector<int> result(nums.size());
        result[0]=1;
        
        int product=1;
        for(int i=1;i<nums.size();++i)
        {
            product*=nums[i-1];
            result[i]=product;
        }
        product=1; //reset the product
         for(int i=nums.size()-2;i>=0;--i)
         {
                product*=nums[i+1];
                result[i]*=product;
         }
        return result; 
    }
};
/*
time complexity -> O(2N) or O(n) where N is the number of elements in nums vector;
space complexity -> O(1), as constant space is used
*/





class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {
        int n = nums.size();
        vector<int>result(n,1);
        int first = 1;
        int last = 1;
        for(int i = 0; i < n; i++){
            result[i] = result[i]*first;
            first = first*nums[i];
        }
        for(int i = n-1;i>=0;i--){
            result[i] = result[i]*last;
            last = last*nums[i];
        }
        return result; 

        
     
        
    }
};
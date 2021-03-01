//TC: O(n) where n is number of elements
//SC: O(1) where 

class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {
        
        vector<int> answer(nums.size());
        answer[0] = 1;
        
        //store all elements to the left side of particular index
        for(int i=1; i<nums.size(); i++){
            answer[i] = answer[i-1]*nums[i-1];
        }
        
        int r = 1;
        //r contains product of all elements to the right of string
        for(int j = nums.size()-1; j>=0; j--){
            answer[j] = answer[j]*r;
            r = r*nums[j];
        }
        
        return answer;
        
    }
};
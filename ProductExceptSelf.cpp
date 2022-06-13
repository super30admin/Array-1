// Approach 1 : Initialized 2 arrays to store  "left" and "right" products and then a third array to store the answer.
// Time Complexity -> O(n), Iterating through an array with 'n' elements.
// Space Compexity -> O(1)
// Problems Faced - No!
// It runs on Leetcode.

class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {
        int n = nums.size();
        vector<int> lA(n, 1);
        vector<int> rA(n, 1);

        for(int i = 1; i < n; i++){
            lA[i] = lA[i-1]*nums[i-1];
        }
        for(int j = n-2; j >=0; j--){
            rA[j] = rA[j+1]*nums[j+1];
        }
        vector<int> answer(n);
        for(int k = 0; k < n; k++){
            answer[k] = lA[k]*rA[k];
        }
        
        return answer;
    }
};


// Approach2 - Initiliazed only one array to get the answer.
// Time Complexity -> O(n), Iterating through an array with 'n' elements.
// Space Compexity -> O(1)
// Problems Faced - No!
// It runs on Leetcode.
class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {
        int n = nums.size();
        vector<int> answer(n, 1);
        int rP = 1;

        for(int i = 1; i < n; i++){
            answer[i] = answer[i-1]*nums[i-1];
        }
        for(int j = n-2; j >=0; j--){
            rP *= nums[j+1];
            answer[j] *= rP;
        }
        
        return answer;
    }
};
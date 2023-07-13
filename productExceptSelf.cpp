// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :
// Three line explanation of solution in plain english

//we are checking the rp from both the ways of the array and multiplyiing both the sides
//and returning the result. First we calculate the left running product of each element and
//store it in the result. Then we iterate over the original array and find the right running
//product of that particular element and multiply it with the left running product already existing
//in the result.

// Your code here along with comments explaining your approach

#include <iostream>
#include <vector>

using namespace std;

class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {

        int n=nums.size();
        int rp = 1;
        vector<int> rNums(nums.size());
        rNums[0]=1;

        for(int i=1;i<n;i++){
            rp=rp*nums[i-1];
            rNums[i]=rp;


        }

        rp=1;
        

        for(int i=n-2;i>=0;i--){
            rp=rp*nums[i+1];
            rNums[i]=rNums[i]*rp;
         

        }

        return rNums;

       

            
    }
};
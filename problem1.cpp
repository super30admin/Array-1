// Time Complexity : O(n) --> We iterate throught the entire array once
// Space Complexity : O(1) --> Only using the output array
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Reducing space complexity from O(n) to O(1)


// Your code here along with comments explaining your approach

/* 2 Line Explanation
    Create an array consisting of the product of values to the left side of the index of the array.
    Multiply this with the product of values to the right hand side of the array

    Tip: 1 Array, 2 pointers, iterate left & right of the index. Get the product. 
*/

#include <iostream>
#include <vector>

using namespace std;

class Solution{
    public:
        vector<int>productExceptSelf(vector<int> &nums)
        {
            vector<int> answer(nums.size());

            int temp = 1; //for iterating through each elements
            int runningProduct = 1; 

            for(int i = 0; i<nums.size(); i++)
            {  
                answer[i] = runningProduct;
                temp = nums[i];
                runningProduct *= temp; 
            }

            runningProduct = 1; //reset values here
            temp = 1;

            for(int i = nums.size() - 1; i >=0; i--) 
            {
                answer[i] *= runningProduct;
                temp = nums[i];
                runningProduct *= temp;            
            }

            return answer;
        }

};
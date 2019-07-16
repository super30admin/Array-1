// Time Complexity : O(m*n) --> Number of rows * no. of columns
// Space Complexity : O(1) --> Only using the output array (which is O(n) but excluded from consideration)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : I was iterating through the diagonal array using length of nums array instead of size of diagonal itself.


// Your code here along with comments explaining your approach

/* 1 Line Explanation of Algorithm
    Keep traversing down-left for odd position & up-right for even position unless there's an edge case.

    Tip: 1 Array, 2 checks with 3 sub-checks. Special Edge case(even): upper-row AND next column both don't exist
*/


#include <iostream>
#include <vector>

using namespace std;

class Solution{
    public: 
        vector<int>DiagonalMatrix(vector<vector<int>> &nums)
        {
            int size = nums.size();
            if(size == 0) return vector<int>(); //return empty array for empty input
            int row = 0;
            int column = 0;
            int columnSize = nums[0].size();

            vector<int> diagonal(size*columnSize);

            for(int i = 0; i<diagonal.size(); i++)
            {   
                diagonal[i] = nums[row][column];
                if((row + column) % 2 == 0)  //even
                {
                    if(column == columnSize - 1) {row++;} //use this first to handle special edge case where row==0 && column+1 doesn't exist
                    else if(row == 0) {column++;}
                    else {row--; column++;}
                }

                else
                {
                    if(row == size - 1) {column++;} //use this first to handle special edge case where column == 0 and row+1 doesn't exist
                    else if(column == 0) {row++;}
                    else {row++; column--;}
                }
            }
            return diagonal;
        }
};
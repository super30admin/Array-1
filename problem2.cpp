#include <iostream>
#include <vector>

using namespace std;

class Solution{
    public: 
        vector<int>DiagonalMatrix(vector<vector<int>> &nums)
        {
            int size = nums.size();
            if(size == 0) return vector<int>();
            int row = 0;
            int column = 0;
            int columnSize = nums[0].size();

            vector<int> diagonal(size*columnSize);

            for(int i = 0; i<diagonal.size(); i++)
            {   
                diagonal[i] = nums[row][column];
                if((row + column) % 2 == 0)  // even
                {
                    if(column == columnSize - 1) {row++;} 
                    else if(row == 0) {column++;}
                    else {row--; column++;}
                }

                else
                {
                    if(row == size - 1) {column++;}
                    else if(column == 0) {row++;}
                    else {row++; column--;}
                }
            }
            return diagonal;
        }
};
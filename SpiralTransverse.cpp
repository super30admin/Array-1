//Time Complexity O(numberOfCoins*amount)
//Space Complexity O(numberOfCoins*amount)

// Problem successfully compiled on leetcode
// No Problems faced while figuring out the logic

#include<vector>
#include<iostream>
using namespace std;

class Solution {
public:
    vector<int> spiralOrder(vector<vector<int> >& matrix) {
        int rowMax = matrix.size()-1;
        int colMax = matrix[0].size()-1;
        vector<int> result;
        int i=0;
        int rowMin=0;
        int colMin=0;
        int col=0;
        int row=0;
        
        for(int k=0;k<(matrix.size())*(matrix[0].size());k++)
        {
            //goright
            if(i%4==0)
            {
                col=colMin;
                while(col<=colMax)
                {
                    result.push_back(matrix[rowMin][col]);
                    col++;
                }
                rowMin++;
            }
            else if(i%4==1)
            {
                row=rowMin;
                while(row<=rowMax)
                {
                    result.push_back(matrix[row][colMax]);
                    row++;
                }
                colMax--;
                //godown
            }
            else if(i%4==2)
            {
                col=colMax;
                while(col>=colMin)
                {
                    result.push_back(matrix[rowMax][col]);
                    col--;
                }
                rowMax--;
                //goLeft
            }
            else
            {
                row=rowMax;
                while(row>=rowMin)
                {
                    result.push_back(matrix[row][colMin]);
                    row--;
                }
                colMin++;
                //goUp
            }
            i++;

            if(colMin>colMax || rowMin>rowMax)
            {
                break;
            }
        }

        return result;
    }
};
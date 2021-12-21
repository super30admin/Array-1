//Time Complexity O(numberOfCoins*amount)
//Space Complexity O(numberOfCoins*amount)

// Problem successfully compiled on leetcode
// No Problems faced while figuring out the logic

#include<vector>
#include<iostream>
using namespace std;

class Solution {
public:
    vector<int> resultArray;
    int noRows;
    int noCols;
    vector<int> findDiagonalOrder(vector<vector<int> >& mat) {
        noRows=mat.size();
        noCols=mat[0].size();
        int i=0;
        int j=0;
        
        for(int loopCount=0;loopCount<(noRows*noCols);loopCount++)
        {
            if((i+j)%2==0)
            {

                resultArray.push_back(mat[i][j]);
                if(j==noCols-1)
                {
                    i++;
                }
                else if(i==0)
                {
                    j++;
                }
                else
                {
                    j++;
                    i--;
                }
            }
            else
            {

                resultArray.push_back(mat[i][j]);
                if(i==noRows-1)
                {
                    j++;
                }
                else if(j==0)
                {
                    i++;
                }
                else
                {
                    i++;
                    j--;
                }
            }
        }
        return resultArray;
    }
    
};
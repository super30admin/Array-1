//Time complexity - O(n^2)
//Space complexity - O(1)
//Ran sucessfully on leetcode

class Solution {
public:
    vector<int> findDiagonalOrder(vector<vector<int>>& matrix) {
        if(matrix.empty())
            return {};
        int m=matrix.size();
        int n=matrix[0].size();
        vector<int>A(m*n);
        int dir=1; //Upward movement
        int i=0,j=0,c=0;
       while(c<m*n)
       {
           A[c]=matrix[i][j];
                if(dir==1)
                {
                    if(j==n-1)
                    {
                        i++;
                        dir=-1;
                    }
                    else if(i==0)
                    {
                        j++;
                        dir=-1;
                    }
                    else
                    {
                        i--;
                        j++;
                    }
                }
           else
           {
               if(i==m-1)
               {
                   dir=1;
                   j++;
               }
               else if(j==0)
               {
                   dir=1;
                   i++;
               }
               else
               {
                   j--;
                   i++;
               }
           }
           c++;
        }
        return A;
    }
};
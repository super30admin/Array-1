//Time complexity - O(n^2)
//Space complexity - O(1)
//Ran sucessfully on leetcode

class Solution {
public:
    vector<int> spiralOrder(vector<vector<int>>& matrix) {
        if(matrix.empty())
            return {};
        int m=matrix.size();//row size
        int n=matrix[0].size();//column size
        vector<int>A(m*n);
        int l=0,r=n-1,t=0,b=m-1,k=0;
        while(l<=r && t<=b)
        {
            if(l<=r && t<=b)
            {
            for(int i=l;i<=r;i++)
            {
                A[k]=matrix[t][i];
                k++;
            }
            }
            t++;
            if(l<=r && t<=b)
            {
            for(int i=t;i<=b;i++)
            {
                A[k]=matrix[i][r];
                k++;
            }
            }
            r--;
             if(l<=r && t<=b)
            {
            for(int i=r;i>=l;i--)
            {
                A[k]=matrix[b][i];
                k++;
            }
             }
            b--;
            if(l<=r && t<=b)
            {
            for(int i=b;i>=t;i--)
            {
                A[k]=matrix[i][l];
                k++;
            }
            }
            l++;
        }
        return A;
    }
};
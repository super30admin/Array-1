//TC = O(MN)
//SC = O(1) ==> we are allowed to store a result vector as per Q

class Solution {
public:
    vector<int> findDiagonalOrder(vector<vector<int>>& mat) 
    {
        int m = mat.size();
        int n = mat[0].size();
        int i=0, j=0, dir = 1;
        vector<int> dp(m*n);
        int k=0; //k is the index of the array we fill
        while(k<m*n)
        {
            dp[k] = mat[i][j]; 
            k++;
            //Up Direction
            if(dir==1)
            {
                if(i==0 && j!=n-1){
                    dir = -1;
                    j++;
                }else if(j==n-1){
                    dir=-1;
                    i++;
                }else{
                    i--;
                    j++;
                }
            }
            //Down Direction
             else
             {
                if(j==0 && i!=m-1){
                    dir = 1;
                    i++;
                }else if(i==m-1){
                    dir=1;
                    j++;
                }else{
                    j--;
                    i++;
                }
            }   
        }
     return dp;
    }
};

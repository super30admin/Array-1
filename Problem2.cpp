// Time Complexity : O(N*M) 
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes 


// Your code here along with comments explaining your approach:
// 1. Use a temparory variable to track if we are going up the diagonal or downwards. 
// 2. If it travels out of bound decrease row and column.
// 3. else if goes negative increase row and col.


class Solution {
public:
    vector<int> findDiagonalOrder(vector<vector<int>>& mat) {
        int f=1;
        vector<int> ans;
        int n=mat.size()-1,m=mat[0].size()-1;
        int i=0,j=0;
        while( i!=n || j!=m ){
            //cout<<mat[i][j]<<' '<<f<<'\n';
            if(f==1){
                ans.push_back(mat[i][j]);i--;j++;
            }else{
                ans.push_back(mat[i][j]);i++;j--;
            }
            if(i<0){
                f=0;i++;
                if(j>m){
                    j--;i++;
                }
            }
            if(j<0){
                f=1;j++;
                if(i>n){
                    i--;j++;
                }
            }
            if(j>m){
                f=0;j--;
                i++;i++;
            }
            if(i>n){
                f=1;i--;
                j++;j++;
            }
            
            
        }
        ans.push_back(mat[n][m]);
        return ans;
    }
};
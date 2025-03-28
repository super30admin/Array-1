// Time Complexity : O(N*M) 
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes 


// Your code here along with comments explaining your approach:
// 1. use 4 variables upper bound, lower bound,left bound and right bound. 
// 2. travel column and if its last column increase lower bound by 1.
// 3. similarly increase for left bound and decrease for right and upper bound.

class Solution {
public:
    vector<int> spiralOrder(vector<vector<int>>& matrix) {
        int m=matrix.size();
        int n=matrix[0].size();
        vector<int> ans;
        int i=0,j=0;
        int r=1,d=0,l=0,u=0;
        while(1){
            ans.push_back(matrix[i][j]);
            matrix[i][j]=101;
            int te=0;
            if( ( (j+1)>=n || matrix[i][j+1]==101 ) && r==1){
                if(( (i+1)>=m || matrix[i+1][j]==101 ) ){
                    break;
                }
                d=1;r=0;
            }
            else if( ( (i+1)>=m || matrix[i+1][j]==101 ) && d==1){
                if( (j-1)<0 || matrix[i][j-1]==101 ){
                    break;
                }
                d=0;l=1;
            }
            else if( ( (j-1)<0 || matrix[i][j-1]==101 ) && l==1){
                if( (i-1)<0 || matrix[i-1][j]==101 ){
                    break;
                }
                l=0;u=1;
            }
            else if( ( (i-1)<0 || matrix[i-1][j]==101 ) && u==1){
                if( (j+1)>=n || matrix[i][j+1]==101 ){
                    break;
                }
                u=0;r=1;
            }

            if((j+1)<n && matrix[i][j+1]!=101 && r==1){
                j++;
            }
            else if((i+1)<m && matrix[i+1][j]!=101 && d==1){
                i++;
            }
            else if((j-1)>=0 && matrix[i][j-1]!=101 && l==1){
                j--;
            }
            else if((i-1)>=0 && matrix[i-1][j]!=101 && u==1){
                i--;
            }
            else{
                break;
            }

        }
        return ans;
    }
};
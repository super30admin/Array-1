//Time complexity:o(m*n)


#include<bits/stdc++.h>
using namespace std;
class Solution {
public:
    vector<int> findDiagonalOrder(vector<vector<int>>& mat) {
        int m = mat.size();
        int n = mat[0].size();
        vector<int>ans(m*n);
        int i=0,j=0;
        bool f = true;
        for(int k=0;k<ans.size();k++){
            ans[k]=mat[i][j];
            if(f){
                if(j==n-1){
                    f = false;
                    i++;
                }
                else if(i==0){
                    f = false;
                    j++;
                }
                else{
                    i--;
                    j++;
                }
            }
            else{
                if(i==m-1){
                    f = true;
                    j++;
                }
                else if(j==0){
                    f = true;
                    i++;
                }
                else{
                    i++;
                    j--;
                }
            }
        }
        return ans;
    }
};
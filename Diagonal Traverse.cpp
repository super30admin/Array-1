//Time Complexity- O(row*col)
//Space Complexity- O(row*col)

class Solution {
public:
    vector<int> findDiagonalOrder(vector<vector<int>>& mat) {
        
        if(mat.size()==0 || mat[0].size()==0){
            return {};
        }
        
        int row=mat.size();
        int col=mat[0].size();
        
        vector<int> ans(row*col);
        int idx=0;
        int i=0;
        int j=0;
        int dir=1;
        
        while(idx<row*col){
            ans[idx++]=mat[i][j];
            if(dir==1){
                if(j==col-1){
                    i++;
                    dir=-1;
                }
                else if(i==0){
                    j+=1;
                    dir=-1;
                }
                else{
                    i--;
                    j++;
                }
            }
            else{
                if(i==row-1){
                    dir=1;
                    j++;
                }
                else if(j==0){
                    i++;
                    dir=1;
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
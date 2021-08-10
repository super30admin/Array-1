//Time Complexity - O(M*N)
//Space Complexity - O(1)

class Solution {
public:
    vector<int> findDiagonalOrder(vector<vector<int>>& mat) {
        int i=0,r=0,c=0,dir=1,m=mat.size(),n=mat[0].size();
        vector<int>v;
        while(1){
            if(r>=m||c>=n){
                break;
            }
            v.push_back(mat[r][c]);
            if(dir==1){
                if(c==n-1){
                    dir=-1;
                    r++;
                }
                else if(r==0){
                    dir=-1;
                    c++;
                }
                else{
                    r--;
                    c++;
                }
            }
            else if(dir==-1){
                if(r==m-1){
                    c++;
                    dir=1;
                }
                else if(c==0){
                    dir=1;
                    r++;
                }
                else{
                    r++;
                    c--;
                }
            }
        }
        return v;
    }
};
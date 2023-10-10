class Solution {
public:
    vector<int> findDiagonalOrder(vector<vector<int>>& mat) {
    int m=mat.size(), n=mat[0].size();
    vector<int> result(m*n);
    int i=0,j=0, index=0;
    bool dir=true;
    while(index<m*n){
        result[index++]= mat[i][j];
        if(dir){
            if(i==0 && j!=n-1){
                j++;
                dir = false;
            }
            else if(j==n-1){
                i++;
                dir=false;
            }
            else{
                i--;
                j++;
            }
        }
        else{
            if(j==0 && i!=m-1){
                i++;
                dir = true;
            }
            else if(i==m-1){
                j++;
                dir = true;
            }
            else{
                i++;
                j--;
            }

        }
    }   
    return result; 
    }
};

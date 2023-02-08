class Solution {
public:
    vector<int> findDiagonalOrder(vector<vector<int>>& mat) {
        int m=mat.size();
        int n=mat[0].size();
        vector<int>arr;
        if(m==0) {
            return {};
        }
        // if(m==1)return mat[0];
        bool up=true;
        int row=0;
        int column=0;
        while(row<m&&column<n){
            arr.push_back(mat[row][column]);
            if(up){
                /* while(row>0&&column<n-1){
                     arr.push_back(mat[row][column]);
                     row--;
                     column++;
                 }*/
                //arr.push_back(mat[row][column]);
                if(column==n-1){
                    row++;
                    up=false;
                }
                else if (row==0){
                    column++;
                    up=false;
                }
                else{
                    row--;
                    column++;
                }


            }
            else{
                /*while(row<n-1&&column>0){
                    arr.push_back(mat[row][column]);
                    row++;
                    column--;
                    }
                    arr.push_back(mat[row][column]);
                    */
                if(row==m-1){
                    column++;
                    up=true;
                }
                else if(column==0){
                    row++;
                    up=true;
                }
                else{
                    row++;
                    column--;
                }

            }

            // up=!up;

        }
        return arr;
    }
};
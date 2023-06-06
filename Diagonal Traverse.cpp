class Solution {
public:
    vector<int> findDiagonalOrder(vector<vector<int>>& mat) {
            int row = mat.size();
             int col = mat[0].size();

        vector <int> ans;

        int i=0;
        int j=0;
        bool dir = true;
        int count = 0;
        int total = row*col;


        while(count<total){
          ans.push_back(mat[i][j]);
          count++;
            if(dir){
                if(i==0 && j!=col-1){
                    j++;
                    dir = false;
                }else if(j== col-1){
                    i++;
                    dir = false;
                }
                else{
                    i--,j++;
                }
            }
            else{
                 if(j==0 && i!=row-1){
                    i++;
                    dir = true;
                }else if(i== row-1){
                    j++;
                    dir = true;
                }
                else{
                    j--,i++;
                }
               
            }

        }

        return ans;
    }
};
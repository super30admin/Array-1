class Solution {
public:
    
    vector<vector<int>> mat;
    int rows, cols;

    vector<int> traverse(int r, int c){
      vector<int> ret;
      int turn = (r+c)%2;

      while(r>=0 && c<cols){
        ret.push_back(mat[r][c]);
        --r;
        ++c;
      }

      if(turn)  reverse(ret.begin(),ret.end());      
      
      return ret;
    }

    vector<int> findDiagonalOrder(vector<vector<int>>& mat) {
        vector<int> ret; 
        //this->mat = mat;
        rows = mat.size();
        cols = mat[0].size();

        vector<vector<int>> v(rows+cols,vector<int>());

        //all elements having equal row+col belong to same diagonal
        for(int i=0;i<rows;i++){
          for(int j=0;j<cols;j++){
            v[i+j].push_back(mat[i][j]);
          }
        }

        //reverse only even diagonal elements
        for(int i=0;i<rows+cols-1;i++){
            if(i%2==0)  reverse(v[i].begin(),v[i].end());
            ret.insert(ret.end(),v[i].begin(),v[i].end());
        }

        return ret;
    }
};
